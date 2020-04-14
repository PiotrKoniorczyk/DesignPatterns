package Flyweight.Flyweight_Lesson.flyweight;

public class UnitStatsRepository {

    private static UnitStats destroyerStats = new UnitStats("Destroyer",500,250,70,10,800);
    private static UnitStats tankStats = new UnitStats("Tank",200,100,50,25,500);
    private static UnitStats riflemanStats = new UnitStats("Rifleman",25,5,20,25,50);

    private UnitStatsRepository() {}

    public static UnitStats getDestroyerStats(){

        return destroyerStats;
    }
    public static UnitStats getTankStats() {

        return tankStats;
    }

    public static UnitStats getRiflemanStats() {

        return riflemanStats;
    }


}
