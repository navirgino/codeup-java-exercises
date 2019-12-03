import java.util.Arrays;

public class ArraysExercises {
    //TODO: create a static method named addPerson. should accept an array of Person objects,
    // as well as a single person obj to add to the passed array.
    //TODO: should return an array whose length is 1 greater than the passed array, with the passed
    // person object at the end of the array.


    public static Person[] addPerson(Person[] arr, Person newPerson) {

        //use copyOf to s.out the passed in person arr
        Person[] newArr = Arrays.copyOf(arr, arr.length + 1);
        //getting end of an array and assigning a new person
        newArr[newArr.length-1] = newPerson;
        //assigning relationship
        newPerson.rel = "gf";
        //for each loop to iterate through the arr
        for (Person person : newArr) {
            System.out.println(person.getName());
            System.out.println(person.rel);
        }

        return newArr;
    }

    ////////////////////////
    //main/////////////////
    ///////////////////////
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        //TODO: make an arr that holds 3 person objects.
        Person[] personArray = new Person[3];

        Person person1 = new Person("Nico");

        person1.rel = "mi";

        Person person2 = new Person("Rain");

        person2.rel = "pops";

        Person person3 = new Person("Gloria");

        person3.rel = "gma";


        personArray[0] = person1;
        personArray[1] = person2;
        personArray[2] = person3;

        //TODO: assign a new instance of the Person class to each element.

//        System.out.println(personArray[0].getName());

        //TODO: iterate through the array and print out the name of each person in the array.


//
        ////forEach Person person :(in) the personArray
//        for (Person person : personArray) {
//            System.out.println(person.getName());
//            System.out.println(person.rel);
//
//        }
//        //alternatively a for loop
//        for(int i = 0; i < personArray.length; i++){
//            System.out.println(personArray[i].getName());
//        }
        addPerson(personArray, new Person("Adri"));


    }
}
