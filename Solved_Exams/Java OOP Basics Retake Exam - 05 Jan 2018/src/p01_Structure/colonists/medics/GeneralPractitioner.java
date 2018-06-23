package p01_Structure.colonists.medics;

public class GeneralPractitioner extends Medic {
    public GeneralPractitioner(String id, String family,
                               int talent, int age, String sign) {
        super(id, family, talent, age, sign);
        int bonus = checkAge(age) + getTalent();
        super.setTalent(bonus);
    }

    private int checkAge(int age) {
        int totalBonus = 0;
        if (age > 15) {
            totalBonus++;
        }

        if ("caring".equals(super.getSign())) {
            totalBonus++;
        } else if ("careless".equals(super.getSign())) {
            totalBonus -= 2;
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
