package com.thebluealliance.api.model.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// TODO: Implement Awards and Webcast

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event  {

    private String key;
    private String name;
    private String short_name;
    private String event_code;
    private String event_type_string;
    private int event_type;
    private String event_district_string;
    private int event_district;
    private int year;
    private String location;
    private String venue_address;
    private String website;
    private boolean official;
    private Team[] teams;
    private Match[] matches;
    //private Award[] awards;
    //private Webcast[] webcast; // type, channel
    private Alliance[] alliances;
    private String district_points;

    public Event() {
    }

    @JsonProperty("alliances")
    public Alliance[] getAlliances() {
        return alliances;
    }

    @JsonProperty("alliances")
    public void setAlliances(Alliance[] alliances) {
        this.alliances = alliances;
    }

    @JsonProperty("district_points")
    public String getDistrictPoints() {
        return district_points;
    }

    @JsonProperty("district_points")
    public void setDistrictPoints(String district_points) {
        this.district_points = district_points;
    }

    @JsonProperty("event_code")
    public String getEventCode() {
        return event_code;
    }

    @JsonProperty("event_code")
    public void setEventCode(String event_code) {
        this.event_code = event_code;
    }

    @JsonProperty("event_district")
    public int getEventDistrict() {
        return event_district;
    }

    @JsonProperty("event_district")
    public void setEventDistrict(int event_district) {
        this.event_district = event_district;
    }

    @JsonProperty("event_district_string")
    public String getEventDistrictString() {
        return event_district_string;
    }

    @JsonProperty("event_district_string")
    public void setEventDistrictString(String event_district_string) {
        this.event_district_string = event_district_string;
    }

    @JsonProperty("event_type")
    public int getEventType() {
        return event_type;
    }

    @JsonProperty("event_type")
    public void setEventType(int event_type) {
        this.event_type = event_type;
    }

    @JsonProperty("event_type_string")
    public String getEventTypeString() {
        return event_type_string;
    }

    @JsonProperty("event_type_string")
    public void setEventTypeString(String event_type_string) {
        this.event_type_string = event_type_string;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("matches")
    public Match[] getMatches() {
        return matches;
    }

    @JsonProperty("matches")
    public void setMatches(Match[] matches) {
        this.matches = matches;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("official")
    public boolean isOfficial() {
        return official;
    }

    @JsonProperty("official")
    public void setOfficial(boolean official) {
        this.official = official;
    }

    @JsonProperty("short_name")
    public String getShortName() {
        return short_name;
    }

    @JsonProperty("short_name")
    public void setShortName(String short_name) {
        this.short_name = short_name;
    }

    @JsonProperty("teams")
    public Team[] getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    @JsonProperty("venue_address")
    public String getVenueAddress() {
        return venue_address;
    }

    @JsonProperty("venue_address")
    public void setVenueAddress(String venue_address) {
        this.venue_address = venue_address;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonProperty("year")
    public int getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return this.getYear() + " " + this.getName();
    }
}
