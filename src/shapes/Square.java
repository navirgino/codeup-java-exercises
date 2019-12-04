package shapes;

public class Square extends Rectangle {

//    double side;

    //define a constructor that accepts on arg - side
    public Square(double side){

        //call the parent's constructor
        super(side, side);

        //set both the length and width to the val of side
//        this.side = side;


    }




    @Override
    public double getPerimeter(){
//        System.out.println(side * side);
//        return side * side;
        return 4 * super.width;
    }

    @Override
    public double getArea(){
//        System.out.println(4 * side);
//        return 4 * side;
        return Math.pow(super.length, 2);
    }

}
