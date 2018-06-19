package p05_OnlineRadioDatabase.exceptions.artist;

import p05_OnlineRadioDatabase.exceptions.InvalidInputException;

public class InvalidArtistNameException extends InvalidInputException {
    public InvalidArtistNameException(String message) {
        super(message);
    }
}
