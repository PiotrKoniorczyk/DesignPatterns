package Flyweight.Practice.Flyweight;

import Flyweight.Lesson.flyweight.UnitStatsRepository;

public class ChessPiece {

    private String name;
    private String numberPosition;
    private String letterPosition;
    private Color color;

    public Color getColor() {
        return color;
    }

    public ChessPiece(String name, String numberPosition, String letterPosition, String color) {

        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch(color.toLowerCase()) {
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            default:
                this.color = ColorRepository.getWhite();
                break;
        }

    }
}

