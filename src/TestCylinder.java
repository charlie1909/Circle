public class TestCylinder {

    public static void main(String[] args) {

        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.

        Cylinder c1 = new Cylinder();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The cylinder c1 has height of "
                + c1.getHeight() + " and volume of " + c1.getVolume());
        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.

        Cylinder c2 = new Cylinder(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The cylinder c2 has height of "
                + c2.getHeight() + " and volume of " + c2.getVolume());


        Cylinder c3 = new Cylinder(3.0, 3.0);
        System.out.println("The cylinder c3 has height of "
                + c3.getHeight() + " and volume of " + c3.getVolume());

        Cylinder c4 = new Cylinder(4.0, 4.0, "Green");
        System.out.println("The cylinder c4 has height of "
                + c3.getHeight() + " and volume of " + c4.getVolume() + " and colour " + c4.getColor());
    }
}
