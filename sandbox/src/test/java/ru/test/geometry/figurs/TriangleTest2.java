package ru.test.geometry.figurs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.net.ssl.ExtendedSSLSession;

public class TriangleTest2 {
    @Test
    void CheckResulPerimetrTriangle(){
        var resultPerimetr = new TriangleTwo(13, 5, 12);
        Assertions.assertEquals(30, resultPerimetr.perimetr());
    }

    @Test
    void CheckResulAreaTriangle(){
        var resultArea = new TriangleTwo(13, 5, 12);
        Assertions.assertEquals(900, resultArea.area());
    }
}
