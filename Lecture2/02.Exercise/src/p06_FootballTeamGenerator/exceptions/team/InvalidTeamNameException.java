package p06_FootballTeamGenerator.exceptions.team;

import p06_FootballTeamGenerator.exceptions.InvalidApplicationException;

public class InvalidTeamNameException extends InvalidApplicationException {
    public InvalidTeamNameException(String message) {
        super(message);
    }
}
