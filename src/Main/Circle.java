public class Circle extends Shape{
    //question 3-6
    protected double radius;

    public Circle(){
        radius = 1.0;
        color = "Red";
    }

    public Circle (double radius){
        this.radius = radius;
        color = "Red";
    }

    public Circle (double radius, String colour, boolean filled){
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColour(String color){
        this.color = color;
    }

    @Override
    public double getArea(){
        double longArea = Math.PI * (radius*radius);
        double area = Math.round(longArea * 100.0) / 100.0;
        return area;
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * getRadius());
    }

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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
