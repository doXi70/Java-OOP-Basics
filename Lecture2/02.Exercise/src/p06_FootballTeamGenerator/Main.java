package p06_FootballTeamGenerator;

import p06_FootballTeamGenerator.exceptions.InvalidApplicationException;
import p06_FootballTeamGenerator.exceptions.team.MissingTeamException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Throwable {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, FootballTeam> teams = new HashMap<>();

        String line;
        while (!"END".equals(line = reader.readLine())) {
            String[] tokens = line.split(";");
            try {
                processInput(teams, tokens);
            } catch (InvalidApplicationException iae) {
                System.out.println(iae.getMessage());
            }
        }

        System.out.println();

    }

    private static void processInput(Map<String, FootballTeam> teams,
                                     String[] tokens) throws Throwable {

        String cmd = tokens[0];
        String teamName = tokens[1];
        String playerName;
        Player player;
        FootballTeam team;

        switch (cmd) {
            case "Team":
                teams.putIfAbsent(teamName, new FootballTeam(teamName));
                break;
            case "Add":
                playerName = tokens[2];
                int endurance = Integer.parseInt(tokens[3]);
                int sprint = Integer.parseInt(tokens[4]);
                int dribble = Integer.parseInt(tokens[5]);
                int passing = Integer.parseInt(tokens[6]);
                int shooting = Integer.parseInt(tokens[7]);

                if (!teams.containsKey(teamName)) {
                    throw new MissingTeamException(String.format("Team %s does not exist.", teamName));
                }

                player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                team = teams.get(teamName);
                if (team == null) {
                    throw new MissingTeamException(String.format("Team %s does not exist.", teamName));
                }
                team.addPlayer(player);
                break;
            case "Remove":
                playerName = tokens[2];
                if (!teams.containsKey(teamName)) {
                    throw new MissingTeamException(String.format("Team %s does not exist.", teamName));
                }

                team = teams.get(teamName);
                team.removePlayer(playerName);
                break;
            case "Rating":
                if (!teams.containsKey(teamName)) {
                    throw new MissingTeamException(String.format("Team %s does not exist.", teamName));
                }

                team = teams.get(teamName);
                System.out.printf("%s - %.0f%n", teamName, team.getRating());
                break;
        }
    }
}
