import javax.naming.RefAddr;
import java.util.Scanner;

public class Circle {
    //question 3-6
    private double radius;
    private String color;

    public Circle(){
        radius = 1.8;
        color = "Red";
    }

    public Circle (double radius){
        this.radius = radius;
        color="Red";
    }

    public Circle(double radius, double value){
        this.radius = radius;
        color = setColor(value);
    }


    public double getRadius() {
        return radius;
    }

    public void getRadiusFromUser(){
        System.out.println("Please enter a radius");
        Scanner scanner = new Scanner(System.in);
        double temp = scanner.nextDouble();
        setRadius(temp);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }


    public String getColor() {
        return color;
    }


    public double getArea(){
        double area = Math.PI * (radius*radius);
        return area;
    }


    //Question 1.15-2
    public String setColor(double value){
        switch ((int) value){
            case 0: case 1: case 2: case 3: case 4: case 5:
                this.color = "Red";
                break;
            case 6: case 7: case 8: case 9: case 10:
                this.color = "Pink";
                break;
            case 11: case 12: case 13: case 14: case 15:
                this.color = "Blue";
                break;
            case 16: case 17: case 18: case 19: case 20:
                this.color = "Orange";
                break;
            case 21: case 22: case 23: case 24: case 25:
                this.color = "Green";
                break;
            default:
                this.color = "Black";
                break;
        }
        return color;
    }

    public void setColour(String color){
        this.color = color;
    }


}
