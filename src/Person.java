public class Person {


    private String name;



    // returns the person's name
    public String getName(){
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    //prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello world! from " + this.name);
    }

    //constructor for person obj name
    public Person(String getName) {
        this.name = getName;
    }

    public static void main(String[] args) {

//        Person person = new Person("Nico");
//        person.sayHello();
//        System.out.println(person.getName());
//
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        //creates new  person obj named john
        Person person1 = new Person("John");

        //creates person2, and assigning to previous object
        Person person2 = person1;

        //will print "John"
        System.out.println(person1.getName());
        //will print "John"
        System.out.println(person2.getName());
        //changes name to Jane
        person2.setName("Jane");
        // Jane
        System.out.println(person1.getName());
        // Jane
        System.out.println(person2.getName());



    }
}



