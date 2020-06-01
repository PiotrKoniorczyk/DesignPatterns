package Visitor.Visitor_Lesson.activity;

import Visitor.Visitor_Lesson.visitor.Visitor;

public class Squash implements Activity {
    private int minPlayed;

    public Squash(int minPlayed) {
        this.minPlayed = minPlayed;
    }

    public int getMinPlayed() {
        return minPlayed;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
