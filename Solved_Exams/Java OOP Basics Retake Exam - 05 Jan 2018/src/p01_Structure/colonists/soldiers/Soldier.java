package p01_Structure.colonists.soldiers;

import p01_Structure.colonists.Colonist;

public class Soldier extends Colonist {

    public Soldier(String id, String family,
                   int talent, int age) {

        super(id, family, talent, age);

        int bonus = talent + 3;
        int ageBonus = age + 3;
        super.setTalent(bonus);
        super.setAge(ageBonus);
    }

    @Override
    public int getPotential() {
        return super.getTalent();
    }

    @Override
    protected void grow(int years) {
        super.setAge(super.getAge() + years);
    }
}
