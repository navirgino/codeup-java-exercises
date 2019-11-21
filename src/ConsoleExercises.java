import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.printf("Pi: %.2f%n", pi);


        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");


        System.out.println("Gimme a number: ");
        int num = scanner.nextInt();
        System.out.println(num);

        System.out.print("Enter Three Words: ");
        String firstInput = scanner.next();
        String secondInput = scanner.next();
        String thirdInput = scanner.next();
        System.out.printf("%s%n", firstInput);
        System.out.printf("%s%n", secondInput);
        System.out.printf("%s%n", thirdInput);


        System.out.println("You entered: --> \"" + firstInput + " " + secondInput + " " + thirdInput + "\" <--");

        scanner.nextLine();

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println(sentence);

        scanner.nextLine();

        System.out.print("Enter length of classroom: ");
        int length = scanner.nextInt();
//        int numLength = Integer.parseInt(length);


        System.out.print("Enter width of classroom: ");
        int width = scanner.nextInt();
//        int numWidth = Integer.parseInt(width);

        System.out.println("Enter a height: ");
        float height = scanner.nextFloat();
//        float numHeight = Float.parseFloat(height);

        System.out.println("Area of the classroom is: " + length * width);


        System.out.println("Perimeter of the classroom is " + ((length * 2) + (width * 2)));


        System.out.println("Volume: " + (height * length * width));


    }


}
