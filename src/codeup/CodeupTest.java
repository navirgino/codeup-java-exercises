package codeup;

public class CodeupTest {
    public static void main(String[] args) {

        String[] sophie = {"Sophie", "K", "Olympic", "Macbook Pro"};

        CodeupStudent Sophie = new CodeupStudent(sophie, true);
        Sophie.greeting();
        Sophie.study();
        System.out.println(Sophie.giveBusinessCards());


        String[] nico = {"Nico", "V", "Deimos", "MacBook Air"};
        CodeupStudent Nico = new CodeupStudent(nico, false);
        Nico.greeting();
        Nico.study();
        System.out.println(Nico.giveBusinessCards());
    }
}
