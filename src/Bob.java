import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter(("\n"));

        System.out.println("Tell Bob something: ");

        String input = sc.next();

        do {

            if (input.endsWith("?")) {
                System.out.println("Bob: Sure");
            }
            else if (input.endsWith("!")) {
                System.out.println("Bob: Whoa chill out!");
            }
            else if (input.trim().equals("")) {
                System.out.println("Bob: Fine, be that way!!!");
            }
            else {
                System.out.println("Whatever");
            }
            input = sc.next();

        } while (!input.equals("I'm done"));

    }
}
