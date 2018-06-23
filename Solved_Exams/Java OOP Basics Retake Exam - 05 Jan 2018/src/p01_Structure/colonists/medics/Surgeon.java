package p01_Structure.colonists.medics;

public class Surgeon extends Medic {
    public Surgeon(String id, String family,
                   int talent, int age, String sign) {

        super(id, family, talent, age, sign);
        int bonus = checkAge(age);
        super.setTalent(bonus);
    }

    private int checkAge(int age) {
        int totalBonus = 0;
        if (age > 25 && age < 35) {
            totalBonus += 2;
        }

        if ("precise".equals(super.getSign())) {
            totalBonus += 3;
        } else if ("butcher".equals(super.getSign())) {
            totalBonus -= 3;
        }

        return totalBonus;
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
