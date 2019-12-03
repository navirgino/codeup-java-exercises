package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    //constructor for rectangle
    public Rectangle(double lengthParam, double widthParam) {
        this.length = lengthParam;
        this.width = widthParam;
    }

    //constructor for perimeter
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }
    //constructor for area
    public double getArea() {
        return this.length * this.width;
    }

}
