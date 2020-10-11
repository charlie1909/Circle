import java.util.Scanner;

public class Cylinder extends Circle{

    private double height = 1;

    public Cylinder(){

    }

    public Cylinder(double radius){
        super(radius);
    }

    public Cylinder(double radius, double height){
        super(radius, height);
    }

    public Cylinder(double radius, double height, String color){
        super(radius, height);
        setColour(color);
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return getArea() * height;
    }
}
