package p06_FootballTeamGenerator.exceptions.team;

import p06_FootballTeamGenerator.exceptions.InvalidApplicationException;

public class MissingTeamException extends InvalidApplicationException {
    public MissingTeamException(String message) {
        super(message);
    }
}
