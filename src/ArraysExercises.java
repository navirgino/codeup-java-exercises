import java.util.Arrays;

public class ArraysExercises {
    //TODO: create a static method named addPerson. should accept an array of Person objects,
    // as well as a single person obj to add to the passed array.
    public static void addPerson(Object arr){
        Person newPerson = new Person("some guy");
    }

    //TODO: should return an array whose length is 1 greater than the passed array, with the passed
    // person object at the end of the array.

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        //TODO: make an arr that holds 3 person objects.
        Person[] personArray = new Person[3];

        Person person1 = new Person("Nico");
//        person1.rel = "mi";

        Person person2 = new Person("Rain");
//        person1.rel = "pops";

        Person person3 = new Person("Gloria");
//        person1.rel = "gma";

        personArray[0] = person1;
        personArray[1] = person2;
        personArray[2] = person3;

        //TODO: assign a new instance of the Person class to each element.

        System.out.println(personArray[0].getName());
        //TODO: iterate through the array and print out the name of each person in the array.


//
        ////forEach Person person :(in) the personArray
        for (Person person : personArray) {
            System.out.println(person.getName());
//            System.out.println(person.rel);

        }
//        //alternatively a for loop
//        for(int i = 0; i < personArray.length; i++){
//            System.out.println(personArray[i].getName());
//        }


    }
}
