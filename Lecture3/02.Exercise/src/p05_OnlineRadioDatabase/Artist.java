package p05_OnlineRadioDatabase;

import p05_OnlineRadioDatabase.exceptions.artist.InvalidArtistNameException;

public class Artist {
    private String name;

    public Artist(String name) {
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.length() < 3 || name.length() > 20) {
            throw new InvalidArtistNameException("Artist name should be between 3 and 20 symbols.");
        }

        this.name = name;
    }
}
