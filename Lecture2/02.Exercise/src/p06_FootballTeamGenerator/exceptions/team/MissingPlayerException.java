package p06_FootballTeamGenerator.exceptions.team;

import p06_FootballTeamGenerator.exceptions.InvalidApplicationException;

public class MissingPlayerException extends InvalidApplicationException {
    public MissingPlayerException(String message) {
        super(message);
    }
}
