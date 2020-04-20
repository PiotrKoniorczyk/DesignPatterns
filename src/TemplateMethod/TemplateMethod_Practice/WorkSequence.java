package TemplateMethod.TemplateMethod_Practice;

abstract public class WorkSequence {
    public final void everyDayIsExaclyTheSame(TypeOfTransport typeOfTransport) {
        wakeUp();
        getReady();
        int time = goToWork(typeOfTransport);
        summary(time);
        work();
        goHome();
    }

    private void goHome() {
        System.out.println("Powrot do domu");
    }

    protected abstract void work();
    protected abstract int goToWork(TypeOfTransport transport);

    protected void summary(int time) {
        System.out.println("Trasa do pracy zajęła: " + time + " minut");
    }

    private void getReady() {
        System.out.println("Przygotowania do wyjscia");
    }

    private void wakeUp() {
        System.out.println("Pobudka");
    }
}