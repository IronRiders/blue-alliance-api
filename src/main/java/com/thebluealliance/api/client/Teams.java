package com.thebluealliance.api.client;

import com.thebluealliance.api.model.v2.Team;

public class Teams extends TBAClient {

    private static Teams _instance = new Teams();

    public static Teams getInstance() {
        return _instance;
    }

    private Teams() {
    }

    public Team[] getAll(int page) {
        return (Team[]) mapData(fetchData("teams/" + page), Team[].class);
    }

    public Team get(String key) {
        return (Team) mapData(fetchData("team/" + key), Team.class);
    }
}
