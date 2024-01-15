package ru.test.geometry.figurs;

public record TriangleTwo(double firstSide, double secondSide, double thirdSide) {
    public double perimetr(){
        return this.firstSide + this.secondSide + this.thirdSide;
    }

    public  double area(){
        double resultP = firstSide + secondSide + thirdSide;
        return resultP * (resultP - firstSide) * (resultP - secondSide) * (resultP - thirdSide);
    }
}
