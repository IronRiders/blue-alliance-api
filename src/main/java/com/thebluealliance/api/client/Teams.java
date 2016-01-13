package com.thebluealliance.api.client;

import com.thebluealliance.api.model.v2.Team;

public class Teams extends TBAClient {

    private static Teams _instance = new Teams();

    private Teams() {
    }

    public static Teams getInstance() {
        return _instance;
    }

    /**
     * Gets a collection of all teams ever registered.
     *
     * @param page A page of teams, zero-indexed. Each page consists of teams whose numbers start at
     *             start = 500 * page_num and end at end = start + 499, inclusive
     *
     * @return An array of Teams, or null
     *
     * @see com.thebluealliance.api.model.v2.Team
     */
    public Team[] getTeams(int page) {
        return (Team[]) mapData(fetchJSON("teams/" + page), Team[].class);
    }

    /**
     * Gets a Team by its key: frcXXXX
     *
     * @param key Team key
     *
     * @return Team or null
     *
     * @see com.thebluealliance.api.model.v2.Team
     */
    public Team getTeam(String key) {
        return (Team) mapData(fetchJSON("team/" + key), Team.class);
    }
}
