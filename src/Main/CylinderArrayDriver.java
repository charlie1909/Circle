import java.util.Arrays;
import java.util.Scanner;

public class CylinderArrayDriver {
    //Extend the code above such that you now have a program that allows the user to enter and store the details of up to 100
    //cylinders in an array and to loop over that array retrieving and printing the details below for each cylinder.
    public static void main(String[] args) {
        System.out.println("Please enter number of cylinders you would like to create");
        Scanner scanner = new Scanner(System.in);
        int cylinderSize = scanner.nextInt();

        Cylinder[] cylinders = new Cylinder[cylinderSize];
        if (cylinderSize < 100) {
            for (int i = 0; i < cylinderSize; i++) {
                int rad = getRadius();
                int height = getHeight();
                String color = getColor();
                cylinders[i] = new Cylinder(rad, height, color);
                System.out.println("Cylinder number "+ (i+1) + ": Radius is "+ rad
                + ", Height is "+ height + ", Color is " + color +
                        ", Base area is " + cylinders[i].getArea()
                + ", Volume is " + cylinders[i].getVolume());
            }
        }else{
            System.out.println("Max 100 cylinders");
        }
    }



    private static String getColor() {
        System.out.println("Please enter color of cylinder");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.next();
        return color;
    }

    private static int getRadius() {
        System.out.println("Please enter radius of cylinder");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        return radius;
    }

    private static int getHeight() {
        System.out.println("Please enter height of cylinder");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        return radius;
    }

}
