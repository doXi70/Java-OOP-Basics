package p05_OnlineRadioDatabase;

public final class Playlist {
    private static final long DEFAULT_START_VALUE_FOR_TIME = 0;
    private static final int DEFAULT_SONGS_COUNT = 0;

    public static long hours = DEFAULT_START_VALUE_FOR_TIME;
    public static long minutes = DEFAULT_START_VALUE_FOR_TIME;
    public static long seconds = DEFAULT_START_VALUE_FOR_TIME;

    public static long totalSeconds = DEFAULT_START_VALUE_FOR_TIME;

    public static int songsCount = DEFAULT_SONGS_COUNT;

    public Playlist() {

    }

    public static void calculateTime(long seconds) {
        songsCount++;
        totalSeconds += seconds;

        long sec = totalSeconds % 60;
        long minutes = totalSeconds % 3600 / 60;
        long hours = totalSeconds % 86400 / 3600;

        Playlist.seconds = sec;
        Playlist.minutes = minutes;
        Playlist.hours = hours;
    }
}
