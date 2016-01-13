package com.thebluealliance.api.client;

import com.thebluealliance.api.model.v2.Match;

public class Matches extends TBAClient {

    private static Matches _instance = new Matches();

    private Matches() {
    }

    public static Matches getInstance() {
        return _instance;
    }

    /**
     * Gets a Match by its key
     *
     * @param key Match key
     *
     * @return Match or null
     *
     * @see com.thebluealliance.api.model.v2.Match
     */
    public Match getMatch(String key) {
        return (Match) mapData(fetchJSON("match/" + key), Match.class);
    }
}
