public class Instructor extends Employee {

    //constructor
    public Instructor(String instructorName){
        super(instructorName);
    }
    @Override
    public void sayHello(){
        System.out.println("Hello Deimos!");

    }
    @Override
    public void doWork(){
        System.out.println("Teaching!");
        System.out.println("Coding!");
        System.out.println("Explaining!");
    }
}
