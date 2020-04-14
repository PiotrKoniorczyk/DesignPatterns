package Factory.Factory_Practice.Car.Ford;

import Factory.Factory_Practice.Car.Car;
import Factory.Factory_Practice.Car.SteeringWheelPosition;

public class Ford extends Car {
    public Ford(double engineCapacity, String fuelType, int productionYear, SteeringWheelPosition position) {
        super(engineCapacity, fuelType, productionYear, position);
    }
}
