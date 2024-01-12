package ru.test.geometry.figurs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    void checkResultForSquareArea(){
        var result = Square.squareArea((5));
        Assertions.assertEquals(25, result);
    }

    @Test
    void checkResultForSquarePerimetr(){
        var result = Square.squarePerimetr(5);
        Assertions.assertEquals(20, result);
    }
}
