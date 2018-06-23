package p01_Structure.colonists.engineer;

public class SoftwareEngineer extends Engineer {
    public SoftwareEngineer(String id, String family,
                               int talent, int age) {

        super(id, family, talent, age);
        int bonus = 2 + super.getTalent();
        super.setTalent(bonus);
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
