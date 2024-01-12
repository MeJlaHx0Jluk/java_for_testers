package ru.test.geometry.figurs;

public class Square {
    public static void printSquareArea(double firstSide){
        String txtresult = String.format("Площадь квадрата со стороной %f = %f", firstSide, squareArea((firstSide)));
        System.out.println(txtresult);
    }

    private static double squareArea(double side){
        return side * side;
    }
}
