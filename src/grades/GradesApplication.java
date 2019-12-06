package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    //create a map for students and github usernames

    public static void create() {
//create four student objects with atleast 3 grades


        Student nico = new Student("Nicola Virgino");
        nico.addGrade(90);
        nico.addGrade(100);
        nico.addGrade(80);

        Student christian = new Student("Christian Crousser");
        christian.addGrade(100);
        christian.addGrade(100);
        christian.addGrade(100);

        Student thorfinn = new Student("Thorfinn Karlsefni");
        thorfinn.addGrade(40);
        thorfinn.addGrade(20);
        thorfinn.addGrade(60);

        Student ash = new Student("Ash Ketchum");
        ash.addGrade(10);
        ash.addGrade(30);
        ash.addGrade(5);


        //hashmap
        HashMap<String, Student> students = new HashMap<>();

        //keys
        students.put("user", nico);
        students.put("username", christian);
        students.put("theUser", thorfinn);
        students.put("isuck", ash);

        //for each loop for printing out usernames to the console.
        System.out.println("WELCOME!");
        System.out.println("Here are the usernames:");
        String usernameSeperator = "|";
        for (String key : students.keySet()) {
            System.out.println(usernameSeperator + key + usernameSeperator);

        }

        //create input object

        System.out.println("WHAT STUDENT DO YOU WANT INFO ON? ");
        Input input = new Input();
        String userInput = input.getString();

        //while loop for user input
        do{
            if (students.get(userInput) != null) {
                System.out.println("Name: " + students.get(userInput).getName());
                System.out.println("Current Avg: " + students.get(userInput).getGradeAverage());

            }else{
                System.out.println("That student does not exist!");

            }
            System.out.println("Would you like to continue? [y/n]");
            input.yesNo();
            if(input.yesNo()){
                System.out.println("Input another student");
                userInput = input.getString();
            }else {
                break;
            }

        }while(true);




    }

    //make main method
    public static void main(String[] args) {

        create();


    }

}

