package p06_FootballTeamGenerator.exceptions.player;

import p06_FootballTeamGenerator.exceptions.InvalidApplicationException;

public class InvalidPlayerNameException extends InvalidApplicationException {
    public InvalidPlayerNameException(String message) {
        super(message);
    }
}
