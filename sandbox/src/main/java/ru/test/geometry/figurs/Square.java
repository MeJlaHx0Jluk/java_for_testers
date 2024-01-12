package ru.test.geometry.figurs;

public class Square {
    public static void printSquareArea(double firstSide){
        String txtresult = String.format("Площадь квадрата со стороной %f = %f", firstSide, squareArea((firstSide)));
        System.out.println(txtresult);
    }

    public static double squareArea(double side){
        return side * side;
    }

    public static Object squarePerimetr(int side) {
        return 4 * side;
    }
}
