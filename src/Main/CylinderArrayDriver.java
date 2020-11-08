import java.util.Random;
import java.util.Scanner;

public class CylinderArrayDriver {
    //Extend the code above such that you now have a program that allows the user to enter and store the details of up to 100
    //cylinders in an array and to loop over that array retrieving and printing the details below for each cylinder.
    public static void main(String[] args) {
//        System.out.println("Please enter number of cylinders you would like to create");
//        Scanner scanner = new Scanner(System.in);
//        int cylinderSize = scanner.nextInt();
//
//        Cylinder[] cylinders = new Cylinder[cylinderSize];
//        if (cylinderSize < 100) {
//            for (int i = 0; i < cylinderSize; i++) {
//                int rad = getRadius();
//                int height = getHeight();
//                String color = getColor();
//                cylinders[i] = new Cylinder(rad, height, color);
//                System.out.println("Cylinder number "+ (i+1) + ": Radius is "+ rad
//                + ", Height is "+ height + ", Color is " + color +
//                        ", Base area is " + cylinders[i].getArea()
//                + ", Volume is " + cylinders[i].getVolume());
//            }
//        }else{
//            System.out.println("Max 100 cylinders");
//        }

        System.out.println("Please enter number of cylinders you would like to automatically create");
        Scanner scanner2 = new Scanner(System.in);
        int cylinderSize2 = scanner2.nextInt();
        long start = System.nanoTime();
        Cylinder[] cylinders2 = new Cylinder[cylinderSize2];

            for (int i = 0; i < cylinderSize2; i++) {
                int min = 1;
                int max = 100;
                Random rand = new Random();
                double rad = rand.nextInt(100);
                double height = rand.nextInt(100);
                String[] colours = {"Blue", "Red", "Green","Black", "Purple", "Pink", "Cyan", "Brown", "Yellow"};
                String color = colours[rand.nextInt(colours.length)];

                cylinders2[i] = new Cylinder(rad, height, color);
                System.out.println("Cylinder number "+ (i+1) + ": Radius is "+ rad
                        + ", Height is "+ height + ", Color is " + color +
                        ", Base area is " + cylinders2[i].getArea()
                        + ", Volume is " + cylinders2[i].getVolume());
            }
        System.out.println("The algorithm took " + (System.nanoTime() - start) + " ns");
    }



    private static String getColor() {
        System.out.println("Please enter color of cylinder");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static int getRadius() {
        System.out.println("Please enter radius of cylinder");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getHeight() {
        System.out.println("Please enter height of cylinder");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
