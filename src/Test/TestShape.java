import org.junit.Test;

public class TestShape {
    @Test
    public void testShape(){

        Shape shape = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
    }
}
