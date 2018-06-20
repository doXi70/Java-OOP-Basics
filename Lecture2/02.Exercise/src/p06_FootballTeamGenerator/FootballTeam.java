package p06_FootballTeamGenerator;

import p06_FootballTeamGenerator.exceptions.team.InvalidTeamNameException;
import p06_FootballTeamGenerator.exceptions.team.MissingPlayerException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;

import static p06_FootballTeamGenerator.app_constants.Constants.MISSING_NAME_MESSAGE;

public class FootballTeam {
    private String name;
    private List<Player> players;
    private long rating;

    public FootballTeam(String name) {
        players = new ArrayList<>();
        setName(name);
    }

    private double calculateTeamRating() {
        double avgRating = 0;

        OptionalDouble average = this.players.stream()
                .map(p -> p.getSTATS().values().stream().mapToInt(x -> x).average())
                .mapToDouble(OptionalDouble::getAsDouble)
                .average();

        if (average.isPresent()) {
            avgRating = average.getAsDouble();
        }

        rating = Math.round(avgRating);
        return rating;
    }

    public double getRating() {
        return calculateTeamRating();
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(this.players);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new InvalidTeamNameException(MISSING_NAME_MESSAGE);
        }

        this.name = name;
    }

    public void removePlayer(String playerName) {
        long playerCount = this.getPlayers().stream()
                .filter(p -> p.getName().equals(playerName))
                .count();

        if (playerCount == 0) {
            throw new MissingPlayerException(
                    String.format("Player %s is not in %s team.", playerName, this.getName()));
        }

        for (int i = 0; i < this.players.size(); i++) {
            Player player = this.players.get(i);
            if (player.getName().equals(playerName)) {
                players.remove(player);
                break;
            }
        }
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

}
