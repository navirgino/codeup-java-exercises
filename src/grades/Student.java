package grades;

import java.util.ArrayList;

public class Student {
    //create a two protected strings for student's name and grades
    private String name;
    //grades should be an array list
    private ArrayList<Integer> grades;

    //create student's name constructor
    //initializes grades as an empty array list
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    };
    // adds the given grade to the grades property
    public void addGrade(Integer grade) {
        this.grades.add(grade);
        System.out.println(this.grades);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        for(int grade : this.grades){
            total += grade;
        }
        return (total / this.grades.size());

    };

    public static void main(String[] args) {
        Student student1 = new Student("Nico");
        System.out.println(student1.getName());
        student1.addGrade(90);
        student1.addGrade(85);
        System.out.println(student1.getGradeAverage());


    }


}
