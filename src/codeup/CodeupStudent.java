package codeup;

public class CodeupStudent extends Student {
    //making an array to make it cleaner
    public CodeupStudent(String[] information, boolean graduated){
        this.firstName = information[0];
        this.lastName = information[1];
        this.cohort = information[2];
        this.computer = information[3];
        this.graduated = graduated;
        //implement abstract methods
    };
        public void greeting(){
            System.out.println("Ello, " + cohort);
        }

        public void study(){
            System.out.println("Full-Stack Java Curriculum");
        }

        public boolean giveBusinessCards(){
            if(graduated){
                return true;
            }else {
                return false;
            }
        }

}
