package p06_FootballTeamGenerator.exceptions.player;

import p06_FootballTeamGenerator.exceptions.InvalidApplicationException;

public class InvalidPlayerStatsException extends InvalidApplicationException {
    public InvalidPlayerStatsException(String message) {
        super(message);
    }
}
