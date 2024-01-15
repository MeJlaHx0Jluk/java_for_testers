import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.test.geometry.figurs.Rectangle;

public class RectangleTest {
    @Test
    void checkResultForRectangleArea(){
        var obj = new Rectangle(10, 10);
        var result = obj.areaRectangle();
        Assertions.assertEquals(100, result);
    }

    @Test
    void checkResultForRectanglePerimetr(){
        var obj = new Rectangle(8, 4);
        var result = obj.perimetrRectangle();
        Assertions.assertEquals(24, result);
    }
}
