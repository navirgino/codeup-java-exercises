public class Manager extends Employee {
    public Manager(String ManagerName) {
        super(ManagerName);

    }

    @Override
    public void sayHello() {
        System.out.println("Hello from your manager!");
    }

    @Override
    public void doWork() {
        System.out.println("I'm working as a manager!!!!");

    }
}
