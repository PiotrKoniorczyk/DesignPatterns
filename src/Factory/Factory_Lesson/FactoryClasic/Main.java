package Factory.Factory_Lesson.FactoryClasic;

import Factory.Factory_Lesson.FactoryClasic.Units.*;

public class Main {

    public static void main(String[] args) {


        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);

    }
}
