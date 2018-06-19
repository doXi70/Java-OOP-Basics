package p05_RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    private Random random;

    public RandomArrayList() {
        this.random = new Random();
    }

    public Object getRandomElement() {
        int randomEl = random.nextInt(super.size());
        return super.get(randomEl);
    }
}
