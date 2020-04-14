package Factory.Factory_Practice;

import Factory.Factory_Practice.Car.BMW.BMWType;
import Factory.Factory_Practice.Car.Car;
import Factory.Factory_Practice.Car.CommonwealthFactory;
import Factory.Factory_Practice.Car.ContinentalFactory;
import Factory.Factory_Practice.Car.Factory;
import Factory.Factory_Practice.Car.Ford.FordType;

public class Main {

    public static void main(String[]args){

         Factory commonwealthFactory = new CommonwealthFactory();
         Factory continentalFactory = new ContinentalFactory();
         Car bmw = commonwealthFactory.createBMWModel(BMWType.E60);
         System.out.println("BMW");
         System.out.println(bmw.getSteeringWheelPosition());

         Car ford = continentalFactory.createFordModel(FordType.CMax);
         System.out.println("Ford");
         System.out.println(ford.getSteeringWheelPosition());
}
}
