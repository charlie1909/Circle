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

        assertEquals("Red", shape.getColor());
        assertEquals(true, shape.isFilled());
        assertEquals(50,shape.getArea(), 0);
        assertEquals(30, shape.getPerimeter(),0);
    }
}
