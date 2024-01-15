package ru.test.geometry;

import ru.test.geometry.figurs.Rectangle;
import ru.test.geometry.figurs.Square;

public class Geometry {
    public static void main(String[] args) {
        var a = 10;
        Square.printSquareArea(new Square(a));
        Square.printSquareArea(new Square(7));
        Square.printSquareArea(new Square(7));
        Square.printSquareArea(new Square(7));

        Rectangle.printRectangleArea(3, 5);
        Rectangle.printRectangleArea(7, 9);
    }

}
