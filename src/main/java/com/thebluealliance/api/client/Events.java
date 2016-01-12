package com.thebluealliance.api.client;

import com.thebluealliance.api.model.v2.Event;
import com.thebluealliance.api.model.v2.Match;
import com.thebluealliance.api.model.v2.Team;

/**
 * Queries The Blue Alliance API for Events
 */
public class Events extends TBAClient {

    private static Events _instance = new Events();

    public static Events getInstance() {
        return _instance;
    }

    private Events() {
    }

    /**
     * Get all events for a given year
     *
     * @param year
     *
     * @return Array of Events for the given year
     *
     * @see com.thebluealliance.api.model.v2.Event
     */
    public Event[] getAll(int year) {
        return (Event[]) mapData(fetchData("events/" + year), Event[].class);
    }
    /**
     * Get a specific event by its key
     *
     * @param eventKey
     *
     * @return Requested event
     *
     * @see com.thebluealliance.api.model.v2.Event
     */
    public Event get(String eventKey) {
        return (Event) mapData(fetchData("event/" + eventKey), Event.class);
    }

    /**
     * Gets all Teams register for an event
     *
     * @param eventKey
     *
     * @return Array of Team
     *
     * @see com.thebluealliance.api.model.v2.Team
     */
    public Team[] getTeams(String eventKey) {
        return (Team[]) mapData(fetchData("event/" + eventKey + "/teams"), Team[].class);
    }

    /**
     * Gets all Matches for an event
     *
     * @param eventKey
     *
     * @return Array of Match
     *
     * @see com.thebluealliance.api.model.v2.Match
     */
    public Match[] getMatches(String eventKey) {
        return (Match[]) mapData(fetchData("event/" + eventKey + "/matches"), Match[].class);
    }
}
