package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double lengthParam) {
        this.length = lengthParam;

    }

    @Override
    public void setWidth(double widthParam) {
        this.width = widthParam;

    }

    @Override
    public double getPerimeter() {
        return 4 * super.width;
    }

    @Override
    public double getArea() {
        return Math.pow(super.length, 2);
    }

////    double side;
//
//    //define a constructor that accepts on arg - side
//    public Square(double side){
//
//        //call the parent's constructor
//        super(side, side);
//
//        //set both the length and width to the val of side
////        this.side = side;
//
//
//    }
//
//
//
//
//    @Override
//    public double getPerimeter(){
////        System.out.println(side * side);
////        return side * side;
//        return 4 * super.width;
//    }
//
//    @Override
//    public double getArea(){
////        System.out.println(4 * side);
////        return 4 * side;
//        return Math.pow(super.length, 2);
//    }

}
