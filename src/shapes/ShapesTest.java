package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        //create a variable of the type Rectangle named box1 and assign it a new

        //instance of the rectangle class with a w of 4 and a l of 5
        Rectangle box1 = new Rectangle(5, 4);
        //verify the getP and getA methods return 18 and 20
        System.out.println("Perimeter of rectangle box1 is: " + box1.getPerimeter());
        System.out.println("Area of rectangle box1 is: " + box1.getArea());

        //create a variable of the type rectangle named box2 and assign it a new instance of the square class
        //that has a side value of 5
        Rectangle box2 = new Square(5);
        System.out.println("Perimeter of square box2 is: " + box2.getPerimeter());
        System.out.println("Area of square box2 is: " + box2.getArea());
    }
}
