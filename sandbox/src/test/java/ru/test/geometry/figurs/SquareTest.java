package ru.test.geometry.figurs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    void checkResultForSquareArea(){
        var objForArea = new Square(10);
        var result = objForArea.areaSquare();
        Assertions.assertEquals(100, result);
    }

    @Test
    void checkResultForSquarePerimetr(){
        var objForPerimetr = new Square(5);
        var result = objForPerimetr.perimetrSquare();
        Assertions.assertEquals(20, result);
    }
}
