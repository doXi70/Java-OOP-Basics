package p01_Structure.colonists;

public abstract class Colonist {
    private String id;
    private String familyId;
    private int talent;
    private int age;

    protected Colonist(String id, String familyId,
                       int talent, int age) {

        setId(id);
        setFamilyId(familyId);
        setTalent(talent);
        setAge(age);
    }

    public String getId() {
        return this.id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public String getFamilyId() {
        return this.familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    public int getTalent() {
        return this.talent;
    }

    protected void setTalent(int talent) {
        this.talent = talent;
    }

    public int getAge() {
        return this.age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public int getPotential() {
        return this.talent;
    }

    protected abstract void grow(int years);
}
