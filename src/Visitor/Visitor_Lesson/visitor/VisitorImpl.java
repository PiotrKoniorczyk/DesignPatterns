package Visitor.Visitor_Lesson.visitor;

import Visitor.Visitor_Lesson.activity.Squash;
import Visitor.Visitor_Lesson.activity.Treadmill;
import Visitor.Visitor_Lesson.activity.Weights;

public class VisitorImpl implements Visitor{
    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Calories burned runing on treadmill :"
                + treadmill.getDistance() *5);


    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Calories burned playing squash :"
                + squash.getMinPlayed() * 20);


    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories burned lifting weights :"
                + weights.getWeight() * weights.getReps() * 2);

    }
}
