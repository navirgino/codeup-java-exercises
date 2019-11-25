import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class MethodsExercises {
//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static int sub(int a, int b) {
//        return a - b;
//    }
//
//    public static int multiplication(int a, int b) {
//        int res = 0;
//        for (int i = 0; i < a; i++) {
//            res += b;
//        }
//        return res;
//    }
//
//    public static int divide(int a, int b) {
//        return a / b;
//    }
//
//    public static int modulus(int a, int b) {
//        return a % b;
//    }


    //Create a method that validates that user input is in a certain range
    //
    //The method signature should look like this:
//    public static int getInteger(int min, int max) {
//        //import scanner for using next line etc
//        Scanner sc = new Scanner(System.in);
//
//        //sout the prompt
//        System.out.print("Enter a number between " + min + " and " + max + ": ");
////        int userInput = getInteger(1, 10);
//
//        if (sc.hasNextInt()) {
//            // makes the scanner class a int variable
//            int userInput = sc.nextInt();
//            // nested if else if it is a integer
//            if(userInput >= min && userInput <= max) {
//                return userInput;
//            } else {
//                System.out.println("Number out of range!");
//                return getInteger(min, max);
//            }
//
//        } else {
//            System.out.println("Invalid Input! ");
//            getInteger(min, max);
//        }
//        return 0;
//    }
//
//
////    Calculate the factorial of a number.
//    public static int factorial(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//
//        //prompt user to enter an integer from 1 to 10
//        System.out.println("Please put in a number between " + min + " and " + max  + ": ");
//
//        int userInput = sc.nextInt();
//        // int variable for starting point and i
//        int i, start = 1;
//        //display the factorial from 1 to 10
//
//        //since it's a factorial i need a for loop
//        for (i = 1; i <= userInput; i++) {
//
//            start = start * i;
//            if(userInput <= max && userInput >= min){
//                System.out.println("Factorial of " + userInput + " x " + i + " is: " + start);
//            }else {
//                System.out.println("Sorry that's not within the range!");
//                break;
//            }
//
//        }
//        System.out.println("Your input was: ");
//        return userInput;
//    }
//Create an application that simulates dice rolling.
    public static void rollDice(){
        Scanner sc = new Scanner(System.in);

        //Prompt user what kind of dice they want to roll

        System.out.println("Soo... D2, D4, D6, or D20?");
        int diceSides = sc.nextInt();
        System.out.println("Would you like roll? [y/n]");
        String roll = sc.next();
        if(roll.equals("y")){
            int diceOne = (int) (diceSides * Math.random() + 1);
            System.out.println("You have rolled your first  " + diceSides + " sided dice.");
            System.out.println("You rolled a " + diceOne + "!");
            int diceTwo = (int) (diceSides * Math.random() + 1);
            System.out.println("You have rolled your second " + diceSides + " sided dice.");
            System.out.println("You rolled a " + diceTwo + "!");
        }else {
            System.out.println("ok");
        }




//        sc.nextLine();


        //Roll two (user input)-sided dice, then ask if they want to do it again.

//        System.out.println("Would you like to continue? [y/n]");
//        String userInput = sc.nextLine();
//        if(userInput.equals("n")){
//            System.out.println("Thanks for playing!");
//
//        } else if (userInput.equals("y")) {
//           rollDice();
//        }
//return rollDice();
    }


    public static void main(String[] args) {
//            System.out.println(add(3, 4));
//            System.out.println(sub(4, 4));
//            System.out.println(multiplication(3, 4));
//            System.out.println(divide(12,4));
//            System.out.println(modulus(4, 3));
//            System.out.println(modulus(4, 4));
//        System.out.println(getInteger(2, 8));
//        System.out.println(factorial(1, 10));
//        System.out.println(rollDice());
        rollDice();


    }


}

