import java.util.Scanner;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ControlFlowExercises {
    public static void main(String[] args) {
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

//        for(int i = 1; i <= 100; i++){
//            if(i%15 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i%3 == 0){
//                System.out.println("Fizz");
//            }else if(i%5 == 0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//        }
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer you want to go up to: ");
        int num = scanner.nextInt();
        System.out.println(num);
        int squared = num * num;
        int cubed = num * num * num;


        System.out.println("number  |  squared  | cubed");
        for(long i = 1; i <= num; i++){
            System.out.println("        |           |      ");
            System.out.println(i   +"       |      "+ i*i +"    |      " + i*i*i);
        }
//        JFrame frame = new JFrame();
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//
//        Object rowData[][] = {
//                {num, squared, cubed},
//        };
//
//        Object columnNames[] = {"Number", "Squared", "Cubed"};
//
//        JTable table = new JTable(rowData, columnNames);
//        JScrollPane scrollPane = new JScrollPane(table);
//        frame.add(scrollPane, BorderLayout.CENTER);
//        frame.setSize(300, 150);
//        frame.setVisible(true);
//
//
//        System.out.println(table);

        //convert given number grades into letter grades
        //display the corresponding letter grade
        //
        System.out.println("Would you like to look at your letter grades?");
        String confirm = scanner.next();
        while(confirm.equalsIgnoreCase("YES")) {
            System.out.println("What was your numeric grade?");
            System.out.println("Enter your grade: ");
            int grade = scanner.nextInt();

            if(grade >= 88){
                System.out.println("A");
            }else if(grade >= 80){
                System.out.println("B");
            }else if(grade >= 67){
                System.out.println("C");
            }else if(grade >= 60){
                System.out.println("D");
            }else if(grade >= 0){
                System.out.println("F");
            }else{
                System.out.println("Huh");
            }




        }




    }

}
