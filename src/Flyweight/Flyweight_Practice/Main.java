package Flyweight.Flyweight_Practice;


import Flyweight.Flyweight_Practice.Flyweight.ChessPiece;
import Flyweight.Flyweight_Practice.Flyweight.chessPieces_Black.BlackPiece;
import Flyweight.Flyweight_Practice.Flyweight.chessPieces_Black.BlackQueen;
import Flyweight.Flyweight_Practice.Flyweight.chessPieces_White.WhitePiece;
import Flyweight.Flyweight_Practice.Flyweight.chessPieces_White.WhiteQueen;

public class Main {
    public static void main(String[] args) {
        ChessPiece blackPawn = new BlackPiece("Czarny Pionek","7", "a");
        ChessPiece whitePawn = new WhitePiece("Biały Pionek","2","a");
        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");
        ChessPiece whiteQueen = new WhiteQueen("Biala Królowa");
        //exactly same color object is used
        System.out.println(blackPawn.getColor()==blackQueen.getColor());
        System.out.println(whitePawn.getColor()==whiteQueen.getColor());
    }
}
