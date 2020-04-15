package Adapter.Adapter_Lesson.Adapter;

public class TwoWayAdapter implements UkDevice, ContinentalDevice {

    UkDevice ukDevice;
    ContinentalDevice continentalDevice;

    public TwoWayAdapter(UkDevice ukDevice, ContinentalDevice continentalDevice) {
        this.ukDevice = ukDevice;
        this.continentalDevice = continentalDevice;
    }

    public void on() {
        ukDevice.powerOn();

    }
    public void powerOn() {
        continentalDevice.on();

    }
}
