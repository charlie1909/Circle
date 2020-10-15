import java.util.ArrayList;
import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {
        //Question 3-6
        Circle plainCircle = new Circle();
        Circle newCircle = new Circle(3);
        String pcol = plainCircle.getColor();
        double prad = plainCircle.getRadius();
        System.out.println("Radius: " + prad + ", Color: " + pcol);
        String col = newCircle.getColor();
        double rad = newCircle.getRadius();
        System.out.println("Radius: " + rad + ", Color: " + col);
        double area = newCircle.getArea();
        System.out.println("Area: " + area);

        Circle circle = new Circle(10);

        Circle circle1 = new Circle();
        System.out.println("Please enter a radius");
        Scanner scanner = new Scanner(System.in);
        double temp = scanner.nextDouble();
        circle1.setRadius(temp);
        System.out.println("User radius: "+ circle1.getRadius() + ", Area: " + circle1.getArea());

        Circle cir = new Circle(5, "Green", false);
        System.out.println(cir.toString());


        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(circle);
        circles.add(newCircle);
        circles.add(plainCircle);
        circles.add(circle1);
        circles.add(cir);

        for (int i = 0; i < circles.size(); i++) {
            double radius = circles.get(i).getRadius();
            String color = circles.get(i).getColor();
            System.out.println(i + "- Radius: " + radius + " , color: " + color);
        }

        System.out.println(new Circle(5).getPerimeter());
    }
}
