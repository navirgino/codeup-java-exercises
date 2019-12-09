package study;

import org.w3c.dom.ls.LSOutput;

class MoviePractice {
    private String name;

//    public String getMovie(String movie) {
//        this.name = movie;
//    }

//    public String plot() {
//        return "No plot here.";
//    }
//
//}
//class DarjeelingLimited extends MoviePractice{
//    public DarjeelingLimited(){
//
//    }

    public static double toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return  -1;
        } else {
            return Math.round((long) kilometersPerHour * 0.6214);
        }
    }

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
    }
}
