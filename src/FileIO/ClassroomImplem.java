package FileIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ClassroomImplem {
    //relative to the project
    final static String dir = "data";
    final static String fileName = "data/classroom.txt";


    public static void main(String[] args) {

        //defining what this file will be called
        Path path = Paths.get(dir);
        Path filePath = Paths.get(fileName);

        if (!Files.exists(path)) {

            try {           //block of code to try
                //does everything
                if(Files.notExists(path)){
                    Files.createDirectory(path);
                }
               if(Files.notExists(filePath)){
                   Files.createFile(filePath);
               }

                System.out.println("Directory " + dir + " created.");
                System.out.println("File " + fileName + " created.");


                //needs a directory
                //Files.createFile(path);

                //there is also a create DIRECTORY option
                // for a singular directory

            } catch (IOException e) {//block of code to handle errors
                e.printStackTrace();
                System.out.println("Directory creation failed.");
            }

        }
//        //let's write some files
        List<String> instructors = new ArrayList<>();
        instructors.add("Fer");
        instructors.add("Sophie");
        instructors.add("Vivian");
        try {
            System.out.println("Added instructors");
            Files.write(path, instructors);
        }catch(IOException e){
            System.out.println("Something went wrong. . .");
            e.printStackTrace();
        }

        //reading and writing files
//        List<String> lines = Files.readAllLines(path);
//        for(String line: lines){
//            System.out.println("line. = " + line.toUpperCase());
//        }

    }


}
