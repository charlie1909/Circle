
public class Cylinder extends Circle{

    protected double height;

    public Cylinder(){
        super();
        height = 1;
    }

    public Cylinder(double radius){
        super(radius);
        height = 1;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color){
        super(radius);
        setHeight(height);
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
