package TemplateMethod.TemplateMethod_Practice;

public class WorkDay extends WorkSequence{


    protected void work() {
        System.out.println("Code monkey get up, get coffee");
    }

    public int goToWork(TypeOfTransport transport) {
        switch(transport) {
            case CAR:
                return 15;
            case BIKE:
                return 25;
            case TRAM:
                return 20;
            default:
                return 20;
        }
    }
}
