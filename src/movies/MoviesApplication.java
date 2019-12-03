package movies;

import util.Input;

import java.util.Arrays;
import java.util.ArrayList;

import java.util.Scanner;

public class MoviesApplication {
    //TODO: give the user a list of options for viewing all the movies or viewing movies by category.


    //new static movie method for new/added movies
    public static Movie[] addMovie(Movie[] arr, Movie newMovie) {

        //creating new movie array with newly created movie
        Movie[] newAddedMovieArr = Arrays.copyOf(arr, arr.length + 1);

        //adding to the end of the array
        newAddedMovieArr[newAddedMovieArr.length - 1] = newMovie;

        //returning the newly added movie array
        return newAddedMovieArr;
    }

    public static void main(String[] args) {

        // create new input obj
        Input input = new Input();

        //s.out user input menu
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - add a new movie!\n" +
                "\n" +
                "...");

        //store user input using Input class' method getInt()
        int userInput = input.getInt();

        //s. out userInput
        System.out.println(userInput);

        //create new movie array and assign it to the MoviesArray class,
        // and use the findAll() method
        Movie[] newMovieArr = MoviesArray.findAll();


        //while loop for user to continue if not 0
        while (true) {

            //conditional for userInputs
            if (userInput == 1) {
                for (Movie movie : newMovieArr) {
                    System.out.println(movie.getMovieName());

                }

            } else if (userInput == 2) {
                for (Movie movie : newMovieArr) {
                    if (movie.getMovieCat().equalsIgnoreCase("animated")) {
                        System.out.println(movie.getMovieName() + "--" + movie.getMovieCat());

                    }
                }

            } else if (userInput == 3) {
                for (Movie movie : newMovieArr) {
                    if (movie.getMovieCat().equalsIgnoreCase("drama")) {
                        System.out.println(movie.getMovieName() + "--" + movie.getMovieCat());

                    }
                }
            } else if (userInput == 4) {
                for (Movie movie : newMovieArr) {
                    if (movie.getMovieCat().equalsIgnoreCase("horror")) {
                        System.out.println(movie.getMovieName() + "--" + movie.getMovieCat());

                    }
                }
            } else if (userInput == 5) {
                for (Movie movie : newMovieArr) {
                    if (movie.getMovieCat().equalsIgnoreCase("scifi")) {
                        System.out.println(movie.getMovieName() + "--" + movie.getMovieCat());

                    }
                }
            }
            //big conditional for adding a new movie
            else if (userInput == 6) {
                //import scanner
                Scanner sc = new Scanner(System.in);

                //s.out title for user
                System.out.println("Put in the title: ");
                //store/scan title input, and go to the next line
                String titleInput = sc.nextLine();

                //s.out cat for user
                System.out.println("Put in the category: ");
                //store/scan cat input, and go to the next line
                String categoryInput = sc.nextLine();

                //add s.out
                System.out.println("Adding...\n" + titleInput + "--" + categoryInput);

                //create new movie obj
                Movie newMovie = new Movie(titleInput, categoryInput);

                //s.out the list of movies
                System.out.println(newMovie.getMovieName());


                //call newMovieArr and assign it to the addMovie method
                newMovieArr = addMovie(newMovieArr, newMovie);


                //for each movies + new added movie
                for (Movie movie : newMovieArr) {
                    System.out.println(movie.getMovieName());
                }

            } else if (userInput == 0) {
                System.out.println("Exiting...");
                break;

            }
            //call userInput to reassign
            userInput = input.getInt();

        }

    }
}
