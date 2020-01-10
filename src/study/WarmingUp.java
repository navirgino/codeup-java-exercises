package study;

public class WarmingUp {
    public static int SimpleAdding(int num) {
        int bucket = 0;
        for (int i = 1; i <= num; i++) {
            bucket += i;
        }
        return bucket;
    }

    public static double exponentialMethod(double base, double exponent) {
        double bucket = base;
        double remainder = exponent % 1;
        double decimal = exponent - remainder;
        for (int i = 1; i <= exponent; i++) {
            bucket += (base * bucket);
        }
        bucket *= base * decimal;
        return bucket;

    }

    public static double gainWeight() {
        int nicosWeight = 200;
        int christmasFood = 40;
        nicosWeight += christmasFood;

        return nicosWeight;
    }

    public static void main(String[] args) {
//        System.out.println(exponentialMethod(4, 2));
        System.out.println(gainWeight());
    }
}


