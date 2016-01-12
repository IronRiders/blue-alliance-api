package com.thebluealliance.api.model.v2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Video {

    private String key;
    private String type;

    public Video() {
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }
}
