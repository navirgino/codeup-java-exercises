package study;

public class RevisitingOOP {
    //public - keyword is an access modifier that we use to determine what access we want to allow others to have
    //to this new class (UNRESTRICTED ACCESS TO THE CLASS)

    //private - no other class can access that class

    //protected - only classes in the package can access this class


    //encapsulation in java is use to hide the fields and methods, from access publicly.
    //this essentially means the internal representation of an object is going to be hidden
    // from view outside the object's definition
    static class Car {
        private int doors;
        private int wheels;
        private String model;
        private String engine;
        private String color;

        //we assign these to private to only allow the car class to access these variables.
        ///
        //in Java, when you created a method in a class, it is then attached to all objects for that particular class

        //setter/constructor

        public void setCar(String model,
                           String engine,
                           String color,
                           int doors,
                           int wheels)
        {
            this.model = model;
            this.engine = engine;
            this.color = color;
            this.doors = doors;
            this.wheels = wheels;
        }
        //getters
        public String getModel(){
            return this.model;
        }
        public String getEngine(){
            return this.engine;
        }
        public String getColor(){
            return this.color;
        }
        public int getNumOfDoors(){
            return this.doors;
        }
        public int getNumOfWheels(){
            return this.wheels;
        }

    }

    public static void main(String[] args) {
        Car porsche = new Car();
        Car honda = new Car();
        porsche.setCar("Carrera", "Big engine", "red", 4, 4);


        System.out.println(porsche.getModel());
        System.out.println(porsche.getEngine());
        System.out.println(porsche.getColor());
        System.out.println(porsche.getNumOfDoors());
        System.out.println(porsche.getNumOfWheels());



    }
}
