public class Geometry {
    public static void main(String[] args) {
        var a = 10;
        printSquareArea(a);
        printSquareArea(7);
        printSquareArea(5);
        printSquareArea(3);

        printRectangleArea(3, 5);
        printRectangleArea(7, 9);
    }

    public static void printRectangleArea(double theFirstSide, double theSecondSide){
        System.out.println("Площадь прямоугольника со сторонами " + theFirstSide + " " + theSecondSide + " = " + rectangleArea(theFirstSide, theSecondSide));
    }
    public static void printSquareArea(double firstSide){
        System.out.println("Площадь квадрата со стороной " + firstSide + " = " + squareArea(firstSide));
    }

    public static double rectangleArea(double nOne, double nTwo){
        return nOne * nTwo;
    }

    public static double squareArea(double side){
        return side * side;
    }
}
