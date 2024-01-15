package ru.test.geometry.figurs;

public class Triangle {
    public static double trianglePerimetr(double a, double b, double c){
        double result = a + b + c;
        return result;
    }

    public static double triangleArea(double a, double b, double c){
        double findP = (a + b + c) / 2;
        double result = findP * (findP - a) * (findP - b) * (findP - c);
        return result;
    }

//    public static void printResultPerimetrOfTriangle(double fSide, double sSide, double tSide){
//        var txtResult = String.format("Периметр треугольника со сторонами %f, %f, %f = %f", fSide, sSide, tSide, trianglePerimetr(fSide, sSide, tSide));
//        System.out.println(txtResult);
//    }
}
