package Adapter.Adapter_Lesson.Adapter;

public class UkToContinentalAdapter implements ContinentalDevice{

    UkDevice device;

    public UkToContinentalAdapter(UkDevice device) {
        this.device = device;
    }

    public void on() {
        device.powerOn();

    }
}
