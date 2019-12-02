package movies;

import java.util.Arrays;

public class Movie {
    //TODO: create private fields name and category and a constructor
    private String name;
    private String category;

    //TODO: create constructor
    public Movie(String getName, String getCategory) {
        this.name = getName;
        this.category = getCategory;
    }




    //TODO: create getter
    public String getMovieName(){
        return this.name;

    }

    public String getMovieCat(){

        return this.category;
    }



}


