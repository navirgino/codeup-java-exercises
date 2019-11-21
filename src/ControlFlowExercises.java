public class ControlFlowExercises {
    public static void main(String[] args){
//        Integer i = 5;
//        while (i <= 15){
//            System.out.println(i++);
//        }

//
//        long i = 2L;
//        do{
//            System.out.println(i);
//            i = i*i;
//        }while (i <= 1000000);


//        for(int i = 5; i <= 15; i++){
//            System.out.println(i++);
//        }

//        for(long i = 2L; i <= 1000000; i*=i){
//            System.out.println(i);
//        }

        for(int i = 1; i <= 100; i++){
            if(i%15 == 0){
                System.out.println("FizzBuzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

    }

}
