import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        //TODO: make an arr that holds 3 person objects.
        Person[] personArray = new Person[3];



        //TODO: assign a new instance of the Person class to each element.
        personArray[0] = new Person("Nico");
        personArray[1] = new Person("Niko");
        personArray[2] = new Person("Neko");
        //        System.out.println(personArray[0].getName());
        //TODO: iterate through the array and print out the name of each person in the array.



        ////forEach Person person :(in) the personArray
        for (Person person : personArray) {
            System.out.println(person.getName());
        }
        //alternatively a for loop
        for(int i = 0; i < personArray.length; i++){
            System.out.println(personArray[i].getName());
        }

        //TODO: create a static method named addPerson. should accept an array of Person objects,
        // as well as a single person obj to add to the passed array.


        //TODO: should return an array whose length is 1 greater than the passed array, with the passed
        // person object at the end of the array.





    }
}
