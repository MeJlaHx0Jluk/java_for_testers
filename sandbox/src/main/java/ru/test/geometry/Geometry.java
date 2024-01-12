package ru.test.geometry;

import ru.test.geometry.figurs.Rectangle;
import ru.test.geometry.figurs.Square;

public class Geometry {
    public static void main(String[] args) {
        var a = 10;
        Square.printSquareArea(a);
        Square.printSquareArea(7);
        Square.printSquareArea(5);
        Square.printSquareArea(3);

        Rectangle.printRectangleArea(3, 5);
        Rectangle.printRectangleArea(7, 9);
    }

}
