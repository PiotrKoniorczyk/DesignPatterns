package Strategy.Strategy_Lesson;

import Strategy.Strategy_Lesson.chef.Chef;
import Strategy.Strategy_Lesson.chef.egg_cooker.HardBoildEggCooker;
import Strategy.Strategy_Lesson.chef.egg_cooker.SoftBoildEggCooker;

public class Main {
    public static void main(String[] args) {


        //Nowe zamówienie - jajka na twardo

        Chef chef = new Chef("Gordon gesler");
        chef.setEggCooker(new HardBoildEggCooker());

        chef.cook();

        //Nowe zamówienie - jajka na miękko

        chef.setEggCooker(new SoftBoildEggCooker());
        chef.cook();

    }

}
