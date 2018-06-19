package p05_OnlineRadioDatabase.exceptions.song;

import p05_OnlineRadioDatabase.exceptions.InvalidInputException;

public class InvalidSongNameException extends InvalidInputException {
    public InvalidSongNameException(String message) {
        super(message);
    }
}
