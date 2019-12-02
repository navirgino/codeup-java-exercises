import java.util.Random;

public class ServerNameGenerator {

    static final String[] adjectives = new String[]{
            "aggressive", "agreeable", "ambitious", "brave", "calm",
            "delightful", "eager", "faithful", "clumsy", "fierce"};
    static final String[] nouns = new String[]{
            "people", "history", "art", "world", "information",
            "family", "government", "health", "system", "computer"};

    private static void randomElement(String[] adjectives, String[] nouns){

        Random random = new Random();
        int indexAdj = random.nextInt(adjectives.length);
        int indexNouns = random.nextInt(nouns.length);

        System.out.println("Here is your server name: " + adjectives[indexAdj] +"-"+ nouns[indexNouns]);


    }

    public static void main(String[] args) {
        randomElement(adjectives, nouns);
    }
}
