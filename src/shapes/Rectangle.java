package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double lengthParam, double widthParam) {
        super(lengthParam, widthParam);
    }

    @Override
    public void setLength(double lengthParam) {

    }

    @Override
    public void setWidth(double widthParam) {

    }

    @Override
    //if left out code fails to compile because it does not make rectangle abstract
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
//    protected double length;
//    protected double width;
//
//    //constructor for rectangle
//    public Rectangle(double lengthParam, double widthParam) {
//        this.length = lengthParam;
//        this.width = widthParam;
//    }
//
//    //constructor for perimeter
//    public double getPerimeter() {
//        return (2 * this.length) + (2 * this.width);
//    }
//    //constructor for area
//    public double getArea() {
//        return this.length * this.width;
//    }

}
