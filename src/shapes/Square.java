package shapes;

public class Square extends Rectangle {

    int side;

    //define a constructor that accepts on arg - side
    public Square(int side){
        //call the parent's constructor
        super(side, side);
        this.side = side;
        //set both the length and width to the val of side
    }


    @Override
    public int getArea(){
//        System.out.println(4 * side);
        return 4 * side;
    }

    @Override
    public int getPerimeter(){
//        System.out.println(side * side);
        return side * side;
    }

}
