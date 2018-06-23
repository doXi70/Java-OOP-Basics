package p01_Structure.colonists.engineer;

import p01_Structure.Family;
import p01_Structure.colonists.Colonist;

public abstract class Engineer extends Colonist {

    protected Engineer(String id, String family,
                            int talent, int age) {

        super(id, family, talent, age);
        int engineerClassBonus = talent + 3;
        engineerClassBonus += checkAge(age);
        super.setTalent(engineerClassBonus);
    }

    private int checkAge(int age) {
        if (age > 30) {
            return 2;
        } else {
            return 0;
        }
    }
}
