package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter [y/n]");
        System.out.println(input.yesNo());
        input.getInt(1, 10);
        input.getInt();

        System.out.println(input.yesNo());

        Input newInput = new Input();
        newInput.getDouble(1, 10);
        newInput.getDouble();


    }

}
