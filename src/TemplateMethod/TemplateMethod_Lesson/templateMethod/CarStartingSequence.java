package TemplateMethod.TemplateMethod_Lesson.templateMethod;

abstract public class CarStartingSequence {
    public final void startTheCar(){
        fastenSeatBelts();
        startTheEngine();
        setTheGear();
        go();
    }

    private void fastenSeatBelts() {
        System.out.println("Zapinamy pasy");
    }


    private void go() {
        System.out.println("Wciskamy pedał gazu");
    }

    public abstract void startTheEngine();
    public abstract void  setTheGear();

}
