package Dekorator.Dekorator_Lesson;

public class Main {
    public static void main(String[] args) {
        generateMap();
    }

    private static void generateMap() {
        Terrain terrain = new Plain();
        Terrain terrain1 = new Hill();
        Terrain terrain2 = new SwampDecorator(new Hill());
        Terrain terrain3 = new SwampDecorator(new ForestDecorator(new Plain()));
        Terrain terrain4 = new RoadDecorator(new Hill());

        System.out.println("Swamp hill cost " + terrain2.fuelCost());
        System.out.println("Swamp Forest cost plain " + terrain3.fuelCost());
        System.out.println(terrain4.getDescription()+"  "+terrain4.fuelCost());
    }




}
