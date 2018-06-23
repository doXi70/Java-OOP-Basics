package p01_Structure.colonists.engineer;

public class HardwareEngineer extends Engineer {

    public HardwareEngineer(String id, String family,
                               int talent, int age) {

        super(id, family, talent, age);
        int bonus = checkAge(age) + super.getTalent();
        super.setTalent(bonus);
    }


    private int checkAge(int age) {
        if (age < 18) {
            return 2;
        } else {
            return 0;
        }
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
