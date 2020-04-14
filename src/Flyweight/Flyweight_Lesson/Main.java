package Flyweight.Flyweight_Lesson;

import Flyweight.Flyweight_Lesson.flyweight.Destroyer;
import Flyweight.Flyweight_Lesson.flyweight.Rifleman;
import Flyweight.Flyweight_Lesson.flyweight.Tank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> activeUnits = new ArrayList<>();

        for(int i=0; i<10000;i++){
            activeUnits.add(new Tank(0,0,500));
            activeUnits.add(new Rifleman(0,0,50));
            activeUnits.add(new Destroyer(0,0,250));
        }


    }
}
