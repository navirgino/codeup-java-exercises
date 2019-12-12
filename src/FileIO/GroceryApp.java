package FileIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroceryApp {
    final static String folder = "data";
    final static String fileName = "groceries.txt";

    public static void main(String[] args) {
        Path dataDirectory = Paths.get(folder);
        Path dataFile = Paths.get(folder, fileName);

        Path filepath = Paths.get("data", "groceries.txt");
        Path groceriesPath = Paths.get("data", "groceries.txt");

        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");



        try{

            if(Files.notExists(dataDirectory)){
                Files.createDirectories(dataDirectory);
                Files.write(filepath, groceryList);
            }
            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

            Files.write(filepath, groceryList);

            List<String> groceryListLines = Files.readAllLines(groceriesPath);

            System.out.println("~~~~~~~~List before adding, and appending~~~~~~~~~");
            for (int i = 0; i < groceryListLines.size(); i += 1) {
                System.out.println((i + 1) + ": " + groceryListLines.get(i));
            }

            System.out.println("~~~~~~~~List with updating lines~~~~~~~~~");
            System.out.println("Look in groceries.txt");
            //update a line or modify//

            //reading all lines in the data/groceries.txt, storing in a newGroceryList
            List<String> newGroceryList = Files.readAllLines(Paths.get("data", "groceries.txt"));

            //bucket
            List<String> tempList = new ArrayList<>();

            for(String grocery : newGroceryList){

                //deleting milk
                if(grocery.equals("milk")){

                    //adding cream
                    tempList.add("cream");
                    continue;
                }

                //item being added
                tempList.add(grocery);
            }

            //writing file with the final tempList
            Files.write(filepath, tempList);


            System.out.println("~~~~~~~~List with appending egg line~~~~~~~~~");
            System.out.println("Look in groceries.txt");
            Files.write(
                    Paths.get("data", "groceries.txt"),
                    Arrays.asList("eggs"), // list with one item
                    StandardOpenOption.APPEND
            );


        }catch (IOException ex){
            ex.printStackTrace();
        }



    }
}
