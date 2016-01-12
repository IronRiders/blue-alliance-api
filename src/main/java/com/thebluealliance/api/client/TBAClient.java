package com.thebluealliance.api.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public abstract class TBAClient {

    private static final String _url = "http://www.thebluealliance.com/api/v2/";

    private final Logger logger = LogManager.getLogger(TBAClient.class);

    protected String fetchData(String endpoint) {
        String url = getURL(endpoint);
        logger.debug(url);

        StringBuilder json = new StringBuilder();

        try {
            Reader r = getReader(getConnection(url));
            char c;
            while ((c = (char) r.read()) != '\uFFFF') {
                json.append(c);
            }
            logger.debug(json);
        } catch (IOException e) {
            logger.fatal(e);
        }

        return json.toString();
    }

    protected Object mapData(String json, Class clazz) {
        ObjectMapper mapper = new ObjectMapper();
        Object data = null;

        try {
            if (clazz.isArray()) {
                data = (Object[]) mapper.readValue(json, clazz);
            }
            else {
                data = (Object) mapper.readValue(json, clazz);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    protected String getURL(String append) {
        return _url + append;
    }

    protected URLConnection getConnection(String url) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
        urlConnection.addRequestProperty("X-TBA-App-Id", "frc4180:blue-alliance-api:1.0-SNAPSHOT");
        // TODO: Cloudflare Blocks Java/ UA, create one based on app id?
        urlConnection.addRequestProperty("User-Agent", "intellij/1.0");
        return urlConnection;
    }

    protected Reader getReader(URLConnection urlConnection) throws IOException {
        return new InputStreamReader(urlConnection.getInputStream());
    }


}
