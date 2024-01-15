package ru.test.geometry.figurs;

public record Rectangle(double firstSide, double secondSide) {
    public Rectangle(double firstSide, double secondSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double areaRectangle(){
        return this.firstSide * this.secondSide;
    }

    public double perimetrRectangle(){
        return 2 * (this.firstSide + this.secondSide);
    }
     public static void printRectangleArea(double theFirstSide, double theSecondSide){
         var textResult = String.format("Площадь прямоугольника со сторонами %f и %f = %f", theFirstSide, theSecondSide, rectangleArea(theFirstSide, theSecondSide));
        System.out.println(textResult);
    }

    public static double rectangleArea(double nOne, double nTwo){
        return nOne * nTwo;
    }
}
