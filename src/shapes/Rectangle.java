package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    //constructor for rectangle
    public Rectangle(int lengthParam, int widthParam) {
        this.length = lengthParam;
        this.width = widthParam;
    }

    //constructor for area
    public int getArea() {
        return length * width;
    }

    //constructor for perimeter
    public int getPerimeter() {
        return (2 * length) + (2 * width);
    }

}
