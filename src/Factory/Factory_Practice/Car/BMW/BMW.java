package Factory.Factory_Practice.Car.BMW;

import Factory.Factory_Practice.Car.Car;
import Factory.Factory_Practice.Car.SteeringWheelPosition;

public class BMW extends Car {
    public BMW(double engineCapacity, String fuelType, int productionYear, SteeringWheelPosition position) {
        super(engineCapacity, fuelType, productionYear, position);
    }
}
