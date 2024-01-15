package ru.test.geometry.figurs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void CheckResultPerimetrTriangle(){
        var resultPerimetr = Triangle.trianglePerimetr(10, 5, 4);
        Assertions.assertEquals(19, resultPerimetr);
    }

    @Test
    void CheckResulAreaTriangle(){
        var resultArea = Triangle.triangleArea(13, 5, 12);
        Assertions.assertEquals(900, resultArea);
    }
}
