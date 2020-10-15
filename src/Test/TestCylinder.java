import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCylinder {

    Cylinder c1;
    Cylinder c2;
    Cylinder c3;

    @Before
    public void setUp(){
        c1 = new Cylinder();
        c2 = new Cylinder(2.0);
        c3 = new Cylinder (5, 5, "Blue");
    }

    @Test
    public void testCylinder(){
        System.out.println("Radius is " + c1.getRadius()
                + " Height is " + c1.getHeight()
                + " Color is " + c1.getColor()
                + " Base area is " + c1.getArea()
                + " Volume is " + c1.getVolume());

        assertEquals("Red", c1.getColor());
        assertEquals(1, c1.getRadius(), 0);
        assertEquals(3.14, c1.getArea(), 0);
        assertEquals(true, c1.isFilled());
        assertEquals(6.283185307179586, c1.getPerimeter(), 0);
        assertEquals(3.14, c1.getVolume(), 0);

        System.out.println("Radius is " + c2.getRadius()
                + " Height is " + c2.getHeight()
                + " Color is " + c2.getColor()
                + " Base area is " + c2.getArea()
                + " Volume is " + c2.getVolume());

        assertEquals("Red", c2.getColor());
        assertEquals(2, c2.getRadius(),0);
        assertEquals(12.57, c2.getArea(),0);
        assertEquals(true, c2.isFilled());
        assertEquals(12.566370614359172, c2.getPerimeter(), 0);
        assertEquals(12.57, c2.getVolume(), 0);

        System.out.println("Radius is " + c3.getRadius()
                + " Height is " + c3.getHeight()
                + " Color is " + c3.getColor()
                + " Base area is " + c3.getArea()
                + " Volume is " + c3.getVolume());

        assertEquals("Blue", c3.getColor());
        assertEquals(5, c3.getRadius(),0);
        assertEquals(78.54, c3.getArea(),0);
        assertEquals(true, c3.isFilled());
        assertEquals(31.41592653589793, c3.getPerimeter(), 0);
        assertEquals(392.70000000000005, c3.getVolume(), 0);
    }
}
