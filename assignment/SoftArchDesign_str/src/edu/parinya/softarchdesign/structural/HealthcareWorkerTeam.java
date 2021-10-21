package edu.parinya.softarchdesign.structural;

import java.util.ArrayList;
import java.util.List;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    ArrayList<HealthcareServiceable>  healthcareWorkers;

    public HealthcareWorkerTeam() {
        this.healthcareWorkers = new ArrayList();
    }

    public void addMember(HealthcareServiceable worker) {
        this.healthcareWorkers.add(worker);
    }

    public void removeMember(HealthcareWorker worker) {
        this.healthcareWorkers.remove(worker);
    }

    public void service() {
        this.healthcareWorkers.forEach(HealthcareServiceable::service);
    }

    public double getPrice() {
        return this.healthcareWorkers.stream().mapToDouble(HealthcareServiceable::getPrice).reduce(Double::sum).orElse(0);
    }
}
