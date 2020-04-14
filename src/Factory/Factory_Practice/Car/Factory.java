package Factory.Factory_Practice.Car;

import Factory.Factory_Practice.Car.BMW.BMWType;
import Factory.Factory_Practice.Car.Ford.FordType;

public abstract class Factory {

    abstract public Car createBMWModel(BMWType type);
    abstract public Car createFordModel(FordType type);


}
