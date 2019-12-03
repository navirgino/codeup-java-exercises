public class Employee extends Person {
    //fer notes
    //constructor rules public is the first one

    public Employee(String employeeName) {
        //super will always talk to the parent (be parent)
        //equivalent to Person, e.g. super == Person();
        super(employeeName);
    }
    public void doWork(){
        System.out.println("Working. . .");
    }

    public final double doPayroll(){
        return 4000.60;
    }

    @Override
    //override person in another class
    public void sayHello(){
        System.out.println("Hello, how can I help yaaaa?");
    }

}
