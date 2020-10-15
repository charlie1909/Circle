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
        c3 = new Circle (5, "Green", false);
    }

    @Test
    public void testCircle(){
        assertEquals("Red", c1.getColor());
        assertEquals(1, c1.getRadius(), 0);
        assertEquals(3.14, c1.getArea(), 0);
        assertEquals(true, c1.isFilled());
        assertEquals(6.283185307179586, c1.getPerimeter(), 0);

        assertEquals("Red", c2.getColor());
        assertEquals(2, c2.getRadius(),0);
        assertEquals(12.57, c2.getArea(),0);
        assertEquals(true, c2.isFilled());
        assertEquals(12.566370614359172, c2.getPerimeter(), 0);

        assertEquals("Green", c3.getColor());
        assertEquals(5, c3.getRadius(),0);
        assertEquals(78.54, c3.getArea(),0);
        assertEquals(false, c3.isFilled());
        assertEquals(31.41592653589793, c3.getPerimeter(), 0);
    }

}
