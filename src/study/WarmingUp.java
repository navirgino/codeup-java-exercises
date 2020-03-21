package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public static ArrayList<Integer> sortLists(ArrayList<Integer> arrListOne,
                                               ArrayList<Integer> arrListTwo)
    {
        List<Integer> combinedList = Stream.of(arrListOne, arrListTwo)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        Collections.sort(combinedList);

        return (ArrayList<Integer>) combinedList;
    }
    public static void main(String[] args)
    {
//        System.out.println(exponentialMethod(4, 2));
//        System.out.println(gainWeight());
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        al1.add(5);

        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        al1.add(5);

        System.out.println(sortLists(al1, al2));


    }
}


