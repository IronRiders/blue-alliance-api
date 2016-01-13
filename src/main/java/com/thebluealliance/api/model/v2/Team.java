package com.thebluealliance.api.model.v2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Team {

    private String website;
    private String name;
    private String locality;
    private String region;
    private String country_name;
    private String location;
    private int    team_number;
    private String key;
    private String nickname;
    private int    rookie_year;
    private String motto;

    public Team() {
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    @JsonProperty("locality")
    public void setLocality(String locality) {
        this.locality = locality;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("country_name")
    public String getCountryName() {
        return country_name;
    }

    @JsonProperty("country_name")
    public void setCountryName(String country_name) {
        this.country_name = country_name;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("team_number")
    public int getTeamNumber() {
        return team_number;
    }

    @JsonProperty("team_number")
    public void setTeamNumber(int team_number) {
        this.team_number = team_number;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @JsonProperty("rookie_year")
    public int getRookieYear() {
        return rookie_year;
    }

    @JsonProperty("rookie_year")
    public void setRookieYear(int rookie_year) {
        this.rookie_year = rookie_year;
    }

    @JsonProperty("motto")
    public String getMotto() {
        return motto;
    }

    @JsonProperty("motto")
    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String toString() {
        return this.getTeamNumber() + ": " + this.getNickname();
    }
}
