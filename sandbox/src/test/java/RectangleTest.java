import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.test.geometry.figurs.Rectangle;

public class RectangleTest {
    @Test
    void checkResultForRectangleArea(){
        var result = Rectangle.rectangleArea(10, 10);
        Assertions.assertEquals(100, result);
    }

    @Test
    void checkResultForRectanlePerimetr(){
        var result = Rectangle.rectanglePerimetr(8, 4);
        Assertions.assertEquals(24, result);
    }
}
