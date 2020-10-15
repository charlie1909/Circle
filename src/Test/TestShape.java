import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShape {
    @Test
    public void testShape(){

        Shape shape = new Shape() {
            @Override
            public double getArea() {
                return 50;
            }

            @Override
            public double getPerimeter() {
                return 30;
            }
        };

        System.out.println(" Perimeter is " + shape.getPerimeter()
                + " Color is " + shape.getColor()
                + " Base area is " + shape.getArea());

        assertEquals("Red", shape.getColor());
        assertEquals(true, shape.isFilled());
        assertEquals(50,shape.getArea(), 0);
        assertEquals(30, shape.getPerimeter(),0);
    }
}
