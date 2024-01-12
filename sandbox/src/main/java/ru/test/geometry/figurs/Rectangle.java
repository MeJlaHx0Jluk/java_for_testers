package ru.test.geometry.figurs;

public class Rectangle {
     public static void printRectangleArea(double theFirstSide, double theSecondSide){
         var textResult = String.format("Площадь прямоугольника со сторонами %f и %f = %f", theFirstSide, theSecondSide, rectangleArea(theFirstSide, theSecondSide));
        System.out.println(textResult);
    }

    public static double rectangleArea(double nOne, double nTwo){
        return nOne * nTwo;
    }

    public static double rectanglePerimetr(double firstSide, double secondSide){
         return 2 * (firstSide + secondSide);
    }
}
