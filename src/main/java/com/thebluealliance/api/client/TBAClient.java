package com.thebluealliance.api.client;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

public abstract class TBAClient {

    private static final Properties PROPERTIES = System.getProperties();

    private static Logger logger = LoggerFactory.getLogger(TBAClient.class);

    static {
        logger.trace("Loading properties file...");
        InputStream propertyFile = TBAClient.class.getClassLoader().getResourceAsStream("blue-alliance-api.properties");

        try {
            PROPERTIES.load(propertyFile);
            propertyFile.close();
            logger.debug(PROPERTIES.toString());
        }
        catch (IOException e) {
            logger.error("Failed to load properties file", e);
        }
    }

    /**
     * Fetch JSON from the given URL
     *
     * @param endpoint
     *
     * @return String containing the serialized JSON data relieved
     */
    protected String fetchJSON(String endpoint) {
        String url = getURL(endpoint);

        logger.debug(String.format("Fetching JSON from %s", url));

        StringBuilder json = new StringBuilder();

        try {
            Reader r = new InputStreamReader(getConnection(url).getInputStream());
            char c;
            while ((c = (char) r.read()) != '\uFFFF') {
                json.append(c);
            }
            logger.debug(String.format("Received JSON: %s", json));
        }
        catch (IOException e) {
            logger.error("Error while retrieving JSON", e);
        }

        return json.toString();
    }

    /**
     * Maps JSON contained in the given String to the given class
     *
     * @param json  serialized JSON data
     * @param clazz Class to map serialized JSON data to
     *
     * @return instance of clazz containing data from the serialized JSON
     */
    protected Object mapData(String json, Class clazz) {
        ObjectMapper mapper = new ObjectMapper();
        Object data = null;

        logger.debug(String.format("Mapping JSON data to %s", clazz.getName()));

        try {
            if (clazz.isArray()) {
                data = (Object[]) mapper.readValue(json, clazz);
            }
            else {
                data = (Object) mapper.readValue(json, clazz);
            }
        }
        catch (IOException e) {
            logger.error("Failed to map JSON", e);
        }

        logger.debug(String.format("Mapped JSON: %s", data));

        return data;
    }

    /**
     * Gets the complete URL to retrieve JSON data from
     *
     * @param append URL part that should be appended to the URL from tba.url property
     *
     * @return Complete URL to retrieve JSON data from
     */
    protected String getURL(String append) {
        return PROPERTIES.getProperty("tba.url") + append;
    }

    /**
     * Gets the URLConnection object to establish a connection to the API. Headers required by the API are also
     * specified here. tba.appid and tba.useragent are placed into X-TBA-App-Id and User-Agent headers, respectively.
     *
     * @param url String URL
     *
     * @return
     *
     * @throws IOException
     */
    private URLConnection getConnection(String url) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
        urlConnection.addRequestProperty("X-TBA-App-Id", PROPERTIES.getProperty("tba.appid"));
        // Cloudflare Blocks Java/* User Agent, so use one based on the App-Id
        urlConnection.addRequestProperty("User-Agent", PROPERTIES.getProperty("tba.useragent"));
        return urlConnection;
    }
}
