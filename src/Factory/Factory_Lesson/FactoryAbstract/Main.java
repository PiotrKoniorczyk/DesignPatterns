package Factory.Factory_Lesson.FactoryAbstract;


import Factory.Factory_Lesson.FactoryAbstract.Unit.*;


public class Main {

    public static void main(String[] args) {

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redInfantry = redFactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit redHelicopter = redFactory.createAirUnit(UnitType.HELICOPTER);

        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueInfantry = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit blueHelicopter = blueFactory.createAirUnit(UnitType.HELICOPTER);





    }

}
