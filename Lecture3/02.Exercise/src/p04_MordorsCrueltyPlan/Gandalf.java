package p04_MordorsCrueltyPlan;

import java.util.HashMap;
import java.util.Map;

public class Gandalf {
    private final static Map<String, Integer> FOOD_POINTS;

    static {
        FOOD_POINTS = new HashMap<>();
        FOOD_POINTS.put("cram", 2);
        FOOD_POINTS.put("lembas", 3);
        FOOD_POINTS.put("apple", 1);
        FOOD_POINTS.put("melon", 1);
        FOOD_POINTS.put("honeycake", 5);
        FOOD_POINTS.put("mushrooms", -10);
    }

    private int mood;

    public Gandalf() {

    }

    public String getGandalfMoodType() {
        if (this.mood < -5) {
            return "Angry";
        } else if (this.mood < 0) {
            return "Sad";
        } else if (this.mood < 15) {
            return "Happy";
        } else {
            // FIXME: It must be Java.
            return "JavaScript";
        }
    }

    public void modifyMood(String[] foodEaten) {
        for (String food : foodEaten) {
            if (FOOD_POINTS.containsKey(food)) {
                this.mood += FOOD_POINTS.get(food);
            } else {
                this.mood--;
            }
        }
    }

    public int getMood() {
        return this.mood;
    }
}
