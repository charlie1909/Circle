import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCircle {
    Circle c1;
    Circle c2;
    Circle c3;

    @Before
    public void setUp(){
        c1 = new Circle();
        c2 = new Circle(2.0);
        c3 = new Circle (1, "Green", false);
    }

    @Test
    public void testCircle(){
        assertEquals("Red", c1.getColor());
        assertEquals(1, c1.getRadius(), 0);
        assertEquals(3.14, c1.getArea(), 0);
        assertEquals("Green", c3.getColor());
        assertEquals(1, c3.getRadius(),0);
        assertEquals(3.14, c3.getArea(),0);
        assertEquals(c3.isFilled(), false);
    }

}
