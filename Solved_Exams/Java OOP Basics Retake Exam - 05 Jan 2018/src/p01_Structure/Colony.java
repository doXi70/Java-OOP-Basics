package p01_Structure;

import p01_Structure.colonists.Colonist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Colony {
    private int maxFamilyCount;
    private int maxFamilyCapacity;
    private Map<String, Family> families;
    private List<Colonist> colonists;

    public Colony(int maxFamilyCount, int maxFamilyCapacity) {
        setMaxFamilyCount(maxFamilyCount);
        setMaxFamilyCapacity(maxFamilyCapacity);
        this.colonists = new ArrayList<>();
        this.families = new HashMap<>();
    }

    public List<Colonist> getColonistsByFamilyId(String familyId) {
        return null;
    }

    public int getMaxFamilyCount() {
        return this.maxFamilyCount;
    }

    protected void setMaxFamilyCount(int maxFamilyCount) {
        this.maxFamilyCount = maxFamilyCount;
    }

    public int getMaxFamilyCapacity() {
        return this.maxFamilyCapacity;
    }

    protected void setMaxFamilyCapacity(int maxFamilyCapacity) {
        this.maxFamilyCapacity = maxFamilyCapacity;
    }

    public void addColonist(Colonist colonist) {
        String family = colonist.getFamilyId();

        this.colonists.add(colonist);
    }

    public void removeColonist(String familyId, String memberId) {

    }

    public void removeFamily(String id) {

    }

    public void grow(int years) {

    }

    public String getCapacity() {
        return null;
    }

    public int getPotential() {
        return 0;
    }
}
