package com.thebluealliance.api.client;

import com.thebluealliance.api.model.v2.Event;
import com.thebluealliance.api.model.v2.Match;
import com.thebluealliance.api.model.v2.Team;

public class MainTest {

    public static void main(String[] args) {
        Team[] teams = Teams.getInstance().getTeams(2);
        for (Team team : teams) {
            System.out.println(team);
        }

        Team frc1097 = Teams.getInstance().getTeam("frc1097");
        System.out.println(frc1097);

        Team frc4180 = Teams.getInstance().getTeam("frc4180");
        System.out.println(frc4180);

        Event wamou2015 = Events.getInstance().getEvent("2015wamou");
        System.out.println(wamou2015);

        Team[] wamou2015teams = Events.getInstance().getTeams("2015wamou");
        for (Team team : wamou2015teams) {
            System.out.println(team);
        }

        Match[] wamou2015matches = Events.getInstance().getMatches("2015wamou");
        for (Match match : wamou2015matches) {
            System.out.println(match);
        }

        Match wamou2015_qm58 = Matches.getInstance().getMatch("2015wamou_qm58");
        System.out.println(wamou2015_qm58);
    }
}
