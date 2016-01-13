package com.thebluealliance.api.model.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchAlliance {

    private int score;
    private String[] teams;

    public MatchAlliance() {
    }

    @JsonProperty("score")
    public int getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(final int score) {
        this.score = score;
    }

    @JsonProperty("teams")
    public String[] getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(final String[] teams) {
        this.teams = teams;
    }
}
