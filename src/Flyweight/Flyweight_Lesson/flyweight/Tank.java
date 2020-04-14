package Flyweight.Flyweight_Lesson.flyweight;

public class Tank {

    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;

    public Tank(int x, int y, int hpLeft) {
        stats = UnitStatsRepository.getTankStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
