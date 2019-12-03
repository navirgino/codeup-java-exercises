public class InheritanceAndPolymorph {


    public static void main(String[] args) {

        //creating an array for 2 generic employees
        Employee[] employees = new Employee[2];


        Person dad = new Person("rainier");
        dad.sayHello();
        dad.setHairColor("pepper");
        System.out.println("Dad's hair color is: " + dad.hairColor);


        Employee nico = new Employee("nico");
        employees[1] = nico;
        nico.sayHello();
        nico.doWork();
        nico.setHairColor("black");
        System.out.println("Nico's hair color: " + nico.hairColor);

        Employee sophie = new Instructor("Sophie");
        employees[0] = sophie;
        sophie.sayHello();
        sophie.doWork();

        SuperHero manOfSteel = new SuperHero("Clark Kent", "Superman");
        System.out.println(manOfSteel.getName()); //superman

        System.out.println("Secret identity of Superman is! "+
                manOfSteel.getSecretIdentity()); //clark kent

        Manager theBoss = new Manager("dane");
        System.out.println(theBoss.getName());
        theBoss.doWork();
        theBoss.sayHello();

        for(int i = 0; i < employees.length; i++){
            employees[i].doWork();
        }

    }

}
