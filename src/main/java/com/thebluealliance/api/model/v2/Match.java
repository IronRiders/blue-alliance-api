package com.thebluealliance.api.model.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// TODO: Implement AllianceScore and ScoreBreakdown

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {

    private String key;
    private String comp_level;
    private String set_number;
    private String match_number;
    //private Alliance[] alliances;
    //private String score_breakdown;
    private String event_key;
    private Video[] videos;
    private String time_string;
    private long time;

    /*
    @JsonProperty("alliances")
    public Alliance[] getAlliances() {
        return alliances;
    }

    @JsonProperty("alliances")
    public void setAlliances(Alliance[] alliances) {
        this.alliances = alliances;
    }
    */
    @JsonProperty("comp_level")
    public String getCompLevel() {
        return comp_level;
    }

    @JsonProperty("comp_level")
    public void setCompLevel(String comp_level) {
        this.comp_level = comp_level;
    }

    @JsonProperty("event_key")
    public String getEventKey() {
        return event_key;
    }

    @JsonProperty("event_key")
    public void setEventKey(String event_key) {
        this.event_key = event_key;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("match_number")
    public String getMatchNumber() {
        return match_number;
    }

    @JsonProperty("match_number")
    public void setMatchNumber(String match_number) {
        this.match_number = match_number;
    }
    /*
    @JsonProperty("score_breakdown")
    public String getScoreBreakdown() {
        return score_breakdown;
    }

    @JsonProperty("score_breakdown")
    public void setScoreBreakdown(String score_breakdown) {
        this.score_breakdown = score_breakdown;
    }
    */
    @JsonProperty("set_number")
    public String getSetNumber() {
        return set_number;
    }

    @JsonProperty("set_number")
    public void setSetNumber(String set_number) {
        this.set_number = set_number;
    }

    @JsonProperty("time")
    public long getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(long time) {
        this.time = time;
    }

    @JsonProperty("time_string")
    public String getTimeString() {
        return time_string;
    }

    @JsonProperty("time_string")
    public void setTimeString(String time_string) {
        this.time_string = time_string;
    }

    @JsonProperty("videos")
    public Video[] getVideos() {
        return videos;
    }

    @JsonProperty("videos")
    public void setVideos(Video[] videos) {
        this.videos = videos;
    }
}
