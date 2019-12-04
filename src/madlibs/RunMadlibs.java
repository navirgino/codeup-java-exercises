package madlibs;

public class RunMadlibs {
    public static void main(String[] args) {

        String[] words = {"Fer", "Pink", "Shirt", "The Shirt Store"};

        Version1 version = new Version1(words);
        System.out.println("Once upon a time...");
        System.out.println("There was a person name...");
        System.out.println(version.name);
        System.out.println(version.goToLocation());
        System.out.println("He saw the manager and said ...");
        System.out.println(version.greeting());
        System.out.println("\"I would like to buy\"");
        System.out.println(version.color + " " + version.randomObject);
        System.out.println(version.pickUpObject());
        System.out.println("Then he left");
    }
}
