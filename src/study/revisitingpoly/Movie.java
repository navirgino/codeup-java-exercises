package study.revisitingpoly;

public class Movie {
    protected String name;

    public Movie(String name) {
        this.name = name;

    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return this.name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "a shark eats people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "imperial forces try to take over the universe";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

}
    //no plot for forgettable





