package util;



import java.util.Scanner;

public class Input {

//    private String scanner;

    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.next();
    }

    public boolean yesNo() {
        System.out.println("Type yes/no");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yeet")){
            return true;
        }else {
            return false;
        }

    }


    public int getInt(int min, int max) {
        System.out.println("Enter a number between 1 and 10: ");
        int input = Integer.parseInt(scanner.nextLine());
        if (input < min) {
            System.out.println("The number is lower than the min, try again: ");
            return getInt(min, max);
        } else if (input > max) {
            System.out.println("The number is higher than the max, try again: ");
            return getInt(min, max);
        }
        return input;
    }

    public int getInt() {
        System.out.println("Input a number: ");
        int input = scanner.nextInt();
        System.out.println("Your input was " + input);
        return input;

    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a number to double between 1.0 and 10.0: ");
        double input = Integer.parseInt(scanner.nextLine());
        if (input < min) {
            System.out.println("The number is lower than the min, try again: ");
            return getDouble(min, max);
        } else if (input > max) {
            System.out.println("The number is higher than the max, try again: ");
            return getDouble(min, max);
        }
        return input;
    }

    public double getDouble() {
        System.out.println("Input a number");
        int input = scanner.nextInt();
        System.out.println("Your input was " + input);
        return input;
    }


}
