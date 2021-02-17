package military_elit.impl;

import military_elit.contracts.SpecialisedSoldier;

import java.util.ArrayList;
import java.util.List;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

    private String corps;
    private static final String AIR_FORCES_CORPS_TYPE = "Airforces";
    private static final String MARINES_CORPS_TYPE = "Marines";

    protected SpecialisedSoldierImpl(String id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    private void setCorps(String corps){
        if (!AIR_FORCES_CORPS_TYPE.equalsIgnoreCase(corps) && !MARINES_CORPS_TYPE.equalsIgnoreCase(corps)){
            throw new IllegalArgumentException();
        }
        this.corps = corps;
    }

    @Override
    public String toString() {
        StringBuilder specialisedSoldier = new StringBuilder(super.toString())
                .append(System.lineSeparator());
        specialisedSoldier.append(String.format("Corps: %s", this.corps));
        return specialisedSoldier.toString();
    }
}
