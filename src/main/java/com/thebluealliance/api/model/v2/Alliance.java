package com.thebluealliance.api.model.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Alliance {

    private String[] declines;
    private String[] picks;

    public Alliance() {
    }

    @JsonProperty("picks")
    public String[] getPicks() {
        return picks;
    }

    @JsonProperty("picks")
    public void setPicks(String[] picks) {
        this.picks = picks;
    }

    @JsonProperty("declines")
    public String[] getDeclines() {
        return declines;
    }

    @JsonProperty("declines")
    public void setDeclines(String[] declines) {
        this.declines = declines;
    }
}
