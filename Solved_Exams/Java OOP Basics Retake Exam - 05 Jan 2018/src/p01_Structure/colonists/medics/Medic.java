package p01_Structure.colonists.medics;

import p01_Structure.colonists.Colonist;

public abstract class Medic extends Colonist {
    private String sign;

    protected Medic(String id, String family,
                    int talent, int age, String sign) {

        super(id, family, talent + 2, age);
        this.setSign(sign);
    }


    public String getSign() {
        return this.sign;
    }


    protected void setSign(String sign) {
        this.sign = sign;
    }
}
