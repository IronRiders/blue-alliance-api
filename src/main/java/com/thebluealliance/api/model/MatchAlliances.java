package com.thebluealliance.api.model.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchAlliances {

    private MatchAlliance red;
    private MatchAlliance blue;

    public MatchAlliances() {
    }

    @JsonProperty("blue")
    public MatchAlliance getBlueAlliance() {
        return blue;
    }

    @JsonProperty("blue")
    public void setBlueAlliance(MatchAlliance blueAlliance) {
        this.blue = blue;
    }

    @JsonProperty("red")
    public MatchAlliance getRedAlliance() {
        return red;
    }

    @JsonProperty("red")
    public void setRedAlliance(MatchAlliance redAlliance) {
        this.red = red;
    }
}
