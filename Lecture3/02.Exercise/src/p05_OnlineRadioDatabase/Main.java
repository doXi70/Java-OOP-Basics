package p05_OnlineRadioDatabase;

import p05_OnlineRadioDatabase.exceptions.InvalidInputException;
import p05_OnlineRadioDatabase.exceptions.song.InvalidSongLengthException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int linesCount = Integer.parseInt(reader.readLine());

        String line = reader.readLine();
        for (int i = 0; i < linesCount; i++) {
            String[] tokens = line.split(";");
            String artistName = tokens[0];
            String songName = tokens[1];

            String[] songTokens = tokens[2].split(":");
            long songMins = 0;
            long songSeconds = 0;
            if (songTokens[0].matches("\\d+") && songTokens[1].matches("\\d+")) {
                 songMins = Long.parseLong(songTokens[0]);
                 songSeconds = Long.parseLong(songTokens[1]);
            } else {
                System.out.println("Invalid song length.");
                line = reader.readLine();
                continue;
            }

            try {
                Artist artist = new Artist(artistName);
                Song song = new Song(songName, artist, songMins, songSeconds);
                System.out.println(song);
            } catch (InvalidInputException ie) {
                System.out.println(ie.getMessage());
            }

            if (i != linesCount - 1) {
                line = reader.readLine();
            }

        }

        System.out.println("Songs added: " + Playlist.songsCount);
        System.out.println(String.format("Playlist length: %dh %dm %ds",
                Playlist.hours, Playlist.minutes, Playlist.seconds));
    }
}
