public class MethodsExercises {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int multiplication(int a, int b) {
        int res = 0;
        for(int i = 0; i < a; i++){
            res += b;
        }
        return res;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
    public static int modulus(int a, int b) {
        return a % b;
    }
    public static int getInteger(int min, int max){
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        if(userInput < 10 && userInput > 0 ){

        }
    }

        public static void main (String[]args){
//            System.out.println(add(3, 4));
//            System.out.println(sub(4, 4));
//            System.out.println(multiplication(3, 4));
//            System.out.println(divide(12,4));
//            System.out.println(modulus(4, 3));
//            System.out.println(modulus(4, 4));
            System.out.println(getInteger());

        }


}
