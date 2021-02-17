package military_elit.impl;

import military_elit.contracts.Engineer;
import military_elit.contracts.Private;
import military_elit.contracts.Repair;
import military_elit.contracts.SpecialisedSoldier;

import java.util.Set;
import java.util.stream.Collectors;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    private Set<Repair> repairs;

    public EngineerImpl(String id, String firstName, String lastName, Double salary, String corps, Set<Repair> repairs) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = repairs;
    }

    @Override
    public String toString() {
        StringBuilder engineer = new StringBuilder(super.toString())
                .append(System.lineSeparator());
        engineer
                .append("Repairs:");


        for (Repair repair : this.repairs){
            engineer
                    .append(System.lineSeparator())
                    .append("  " + repair);

        }
        return engineer.toString();
    }
}
