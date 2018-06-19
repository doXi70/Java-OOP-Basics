package p05_OnlineRadioDatabase;

import p05_OnlineRadioDatabase.exceptions.song.InvalidSongLengthException;
import p05_OnlineRadioDatabase.exceptions.song.InvalidSongMinutesException;
import p05_OnlineRadioDatabase.exceptions.song.InvalidSongNameException;
import p05_OnlineRadioDatabase.exceptions.song.InvalidSongSecondsException;

public class Song {
    private String name;
    private Artist artist;
    private long minutes;
    private long seconds;

    public Song(String name, Artist artist, long minutes, long seconds) {
        setArtist(artist);
        setName(name);
        setMinutes(minutes);
        setSeconds(seconds);
        checkSongLen(minutes, seconds);
        Playlist.calculateTime(seconds + (minutes * 60));
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.trim().length() < 3 || name.trim().length() > 20) {
            throw new InvalidSongNameException("Song name should be between 3 and 30 symbols.");
        }

        this.name = name;
    }

    public Artist getArtist() {
        return this.artist;
    }

    private void setArtist(Artist artist) {
        this.artist = artist;
    }

    public long getMinutes() {
        return this.minutes;
    }

    public void setMinutes(long minutes) {
        if (minutes < 0 || minutes > 15) {
            throw new InvalidSongMinutesException("Song minutes should be between 0 and 14.");
        }

        this.minutes = minutes;
    }

    public long getSeconds() {
        return this.seconds;
    }

    public void setSeconds(long seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new InvalidSongSecondsException("Song seconds should be between 0 and 59.");
        }

        this.seconds = seconds;
    }

    private void checkSongLen(long minutes, long seconds) {
        // 00:00:00 - 00:14:59
        long maxLen = (minutes * 60) + seconds;

        if (maxLen > 899 || maxLen < 0) {
            throw new InvalidSongLengthException("Invalid song length.");
        }
    }

    @Override
    public String toString() {
        return "Song added.";
    }
}
