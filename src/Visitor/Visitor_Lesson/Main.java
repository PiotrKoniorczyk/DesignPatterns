package Visitor.Visitor_Lesson;

import Visitor.Visitor_Lesson.activity.Activity;
import Visitor.Visitor_Lesson.activity.Squash;
import Visitor.Visitor_Lesson.activity.Treadmill;
import Visitor.Visitor_Lesson.activity.Weights;
import Visitor.Visitor_Lesson.visitor.VisitorImpl;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill(200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50,10);

        VisitorImpl visitor = new VisitorImpl();
        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);


        System.out.println("-------------------------");

        List<Activity> activityList = Arrays.asList(treadmill, squash, weights);

        activityList.forEach(activity -> activity.accept(visitor));

    }
}
