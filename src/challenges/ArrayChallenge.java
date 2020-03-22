package challenges;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayChallenge {

    public static void sortIntegers(int[] intArr){
        for(int i= 0; i < intArr.length; i++){
            for(int j = i + 1; j < intArr.length; j++){
                int tmp;
                if(intArr[i] < intArr[j]){
                    tmp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(intArr));
    }

    public static void main(String[] args) {

        int[] arr = new int[]{5, 3, 2, 20};
        sortIntegers(arr);
    }

}
