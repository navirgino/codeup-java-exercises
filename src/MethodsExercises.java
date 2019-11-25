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
    public static int getInteger(int min, int max) {
        //import scanner for using next line etc
        Scanner sc = new Scanner(System.in);

        //sout the prompt
        System.out.print("Enter a number between " + min + " and " + max + ": ");
//        int userInput = getInteger(1, 10);

        if (sc.hasNextInt()) {
            // makes the scanner class a int variable
            int userInput = sc.nextInt();
            // nested if else if it is a integer
            if(userInput >= min && userInput <= max) {
                return userInput;
            } else {
                System.out.println("Number out of range!");
                return getInteger(min, max);
            }

        } else {
            System.out.println("Invalid Input! ");
            getInteger(min, max);
        }
        return 0;
    }


//    Calculate the factorial of a number.
    public static int factorial(int min, int max) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please put in a number between 1 and 10!");
        int userInput = getInteger(1, 10);
    }



    public static void main(String[] args) {
//            System.out.println(add(3, 4));
//            System.out.println(sub(4, 4));
//            System.out.println(multiplication(3, 4));
//            System.out.println(divide(12,4));
//            System.out.println(modulus(4, 3));
//            System.out.println(modulus(4, 4));
//        System.out.println(getInteger(2, 8));

    }


}
