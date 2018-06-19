package p05_OnlineRadioDatabase.exceptions.song;

import p05_OnlineRadioDatabase.exceptions.InvalidInputException;

public class InvalidSongLengthException extends InvalidInputException {
    public InvalidSongLengthException(String message) {
        super(message);
    }
}
