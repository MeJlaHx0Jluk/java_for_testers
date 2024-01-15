package ru.test.geometry.figurs;

public class Square {
    public double side;

    public  Square(double side){
        this.side = side;
    }

    public double areaSquare(){
        return this.side * this.side;
    }

    public  double perimetrSquare(){
        return this.side * 4;
    }
    public static void printSquareArea(Square firstSide){
        String txtResult = String.format("Площадь квадрата со стороной %f = %f", firstSide.side, firstSide.areaSquare());
        System.out.println(txtResult);
    }
}
