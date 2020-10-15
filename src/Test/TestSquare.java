import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSquare {

    Square s1;
    Square s2;
    Square s3;

    @Before
    public void setUp(){
        s1 = new Square();
        s2 = new Square(10);
        s3 = new Square(7,"Black", true);
    }

    @Test
    public void testSquare(){
        s1.setLength(5);
        s1.setWidth(5);
        System.out.println("Width is " + s1.getWidth()
                + "Length is " + s1.getLength()
                +" Perimeter is " + s1.getPerimeter()
                + " Color is " + s1.getColor()
                + " Base area is " + s1.getArea());

        assertEquals("Red", s1.getColor());
        assertEquals(5, s1.getSide(), 0);
        assertEquals(5, s1.getWidth(), 0);
        assertEquals(5, s1.getLength(), 0);
        assertEquals(25, s1.getArea(), 0);
        assertEquals(true, s1.isFilled());
        assertEquals(20, s1.getPerimeter(), 0);

        System.out.println("Width is " + s2.getWidth()
                + "Length is " + s2.getLength()
                +" Perimeter is " + s2.getPerimeter()
                + " Color is " + s2.getColor()
                + " Base area is " + s2.getArea());

        assertEquals("Red", s2.getColor());
        assertEquals(10, s2.getSide(),0);
        assertEquals(100, s2.getArea(),0);
        assertEquals(true, s2.isFilled());
        assertEquals(40, s2.getPerimeter(), 0);

        System.out.println("Width is " + s3.getWidth()
                + "Length is " + s3.getLength()
                +" Perimeter is " + s3.getPerimeter()
                + " Color is " + s3.getColor()
                + " Base area is " + s3.getArea());
        assertEquals("Black", s3.getColor());
        assertEquals(7, s3.getSide(),0);
        assertEquals(49, s3.getArea(),0);
        assertEquals(true, s3.isFilled());
        assertEquals(28, s3.getPerimeter(), 0);

    }
}
