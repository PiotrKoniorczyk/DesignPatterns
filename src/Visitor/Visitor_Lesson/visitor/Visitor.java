package Visitor.Visitor_Lesson.visitor;

import Visitor.Visitor_Lesson.activity.Squash;
import Visitor.Visitor_Lesson.activity.Treadmill;
import Visitor.Visitor_Lesson.activity.Weights;

public interface Visitor {
    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);
    }

