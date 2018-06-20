package p06_FootballTeamGenerator;

import p06_FootballTeamGenerator.exceptions.player.InvalidPlayerNameException;
import p06_FootballTeamGenerator.exceptions.player.InvalidPlayerStatsException;

import java.util.LinkedHashMap;
import java.util.Map;

import static p06_FootballTeamGenerator.app_constants.Constants.*;

public class Player {
    private String name;
    private Map<String, Integer> STATS;

    public Player(String name, int endurance, int sprint, int dribble,
                  int passing, int shooting) {

        STATS = new LinkedHashMap<>();

        setName(name);
        setSTATS(endurance, sprint, dribble, passing, shooting);
    }

    public Map<String, Integer> getSTATS() {
        return STATS;
    }

    private void setSTATS(int endurance, int sprint, int dribble,
                          int passing, int shooting) {

        // setting basic stats values
        STATS.put("Endurance", endurance);
        STATS.put("Sprint", sprint);
        STATS.put("Dribble", dribble);
        STATS.put("Passing", passing);
        STATS.put("Shooting", shooting);

        // stats validation
        STATS.forEach((statName, statValue) -> {
            if (statValue < MIN_STATS_VALUE || statValue > MAX_STATS_VALUE) {
                throw new InvalidPlayerStatsException(String.format("%s should be between 0 and 100.", statName));
            }
        });
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new InvalidPlayerNameException(MISSING_NAME_MESSAGE);
        }

        this.name = name;
    }
}

