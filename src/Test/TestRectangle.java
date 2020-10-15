import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRectangle {

    Rectangle r1;
    Rectangle r2;
    Rectangle r3;

    @Before
    public void setUp(){
        r1 = new Rectangle();
        r2 = new Rectangle(10,6);
        r3 = new Rectangle(15,7,"Black", true);
    }

    @Test
    public void testRectangle(){
        assertEquals("Red", r1.getColor());
        assertEquals(5, r1.getWidth(), 0);
        assertEquals(6, r1.getLength(), 0);
        assertEquals(30.0, r1.getArea(), 0);
        assertEquals(true, r1.isFilled());
        assertEquals(22.0, r1.getPerimeter(), 0);

        assertEquals("Red", r2.getColor());
        assertEquals(10, r2.getWidth(),0);
        assertEquals(6, r1.getLength(), 0);
        assertEquals(60, r2.getArea(),0);
        assertEquals(true, r2.isFilled());
        assertEquals(32.0, r2.getPerimeter(), 0);

        assertEquals("Black", r3.getColor());
        assertEquals(15, r3.getWidth(),0);
        assertEquals(7, r3.getLength(), 0);
        assertEquals(105, r3.getArea(),0);
        assertEquals(true, r3.isFilled());
        assertEquals(44.0, r3.getPerimeter(), 0);

    }
}
