package study;

import java.util.Scanner;

public class RevisitingArrays {
    private static Scanner sc = new Scanner(System.in);

//    public static void main(String[] args) {
//        int[] myIntegers = getIntegers(5);
//        for(int i = 0; i < myIntegers.length; i++){
//            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
//        }
//        System.out.println("The average is: " + getAverage(myIntegers));
//
//    }
//
//
//    private static int[] getIntegers(int number) {
//        System.out.println("Enter " + number +  " integer values:\r");
//        int[] values = new int[number];
//
//        for(int i = 0; i < values.length; i++){
//            values[i] = sc.nextInt();
//        }
//        return values;
//    }
//
//    public static double getAverage(int[] array){
//        int sum = 0;
//        for(int i = 0; i <array.length; i++){
//            sum += array[i];
//        }
//        return (double) sum / (double) array.length;
//    }


    /////////////////////
    //////EXERCISE///////
    /////////////////////

    //create a prg using arrays that sorts a list of integers in descending order
    //descending order is highest value to lowest
    public static int[] getIntegers(int numbers){
        System.out.println("Enter " + numbers + " integer values:\r");
        //need bucket
        int[] values = new int[numbers];
        for(int i = 0; i < values.length; i++){
            values[i] = sc.nextInt();
        }
        return values;
    }

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length; i++){
            System.out.println("Index of " + i + " contains: " + myIntegers[i]);
        }
    }







}
