package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    //declare protected variables
    protected double length;
    protected double width;

    //make constructor
    public Quadrilateral(double lengthParam, double widthParam) {
        this.length = lengthParam;
        this.width = widthParam;
    }

    //make method to get length
    public double getLength(){
        return this.length;
    }
    //make method to get width
    public double getWidth(){
        return this.width;
    }

    //abstract to set length
    abstract void setLength(double lengthParam);

    //abstract to set width
    abstract void setWidth(double lengthParam);

}
