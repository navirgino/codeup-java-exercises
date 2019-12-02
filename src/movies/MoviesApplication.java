package movies;

import util.Input;

import java.util.Arrays;
import java.util.ArrayList;

import java.util.Scanner;

public class MoviesApplication {
    //TODO: give the user a list of options for viewing all the movies or viewing movies by category.
    public static Movie[] addMovie(Movie[] arr, Movie newMovie){
        Movie[] newAddedMovieArr = Arrays.copyOf(arr, arr.length + 1);
        newAddedMovieArr[newAddedMovieArr.length-1] = newMovie;
        return newAddedMovieArr;
    }
    public static void main(String[] args) {
        Input input = new Input();
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
        int userInput = input.getInt();
        System.out.println(userInput);
        Movie[] newMovieArr = MoviesArray.findAll();

        while (true) {
            //input class to get user input


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
            } else if(userInput == 6) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Put in the title: ");
                String titleInput = sc.nextLine();

                System.out.println("Put in the category: ");
                String categoryInput = sc.nextLine();

                System.out.println("Adding...\n" + titleInput +"--"+ categoryInput);

                //create new movie obj
                Movie newMovie = new Movie(titleInput, categoryInput);

                //s.o.u.t the list of movies
                System.out.println(newMovie.getMovieName());

                newMovieArr = addMovie(newMovieArr, newMovie);


                for(Movie movie : newMovieArr) {
                    System.out.println(movie.getMovieName());
                }

            } else if (userInput == 0) {
                System.out.println("Exiting...");
                break;

            }
            userInput = input.getInt();

        }

    }
}
