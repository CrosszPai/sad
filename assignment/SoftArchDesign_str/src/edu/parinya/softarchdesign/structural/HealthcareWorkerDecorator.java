package edu.parinya.softarchdesign.structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker {
    HealthcareWorker worker;

    public HealthcareWorkerDecorator(HealthcareWorker worker) {
        super(worker.getName(),worker.getPrice());
        System.out.print("Decorate "+worker.getName()+ " with ");
        this.worker = worker;
    }

    @Override
    public void service() {
        this.worker.service();
    }
}
