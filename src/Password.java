public class Password {
    private String plainTextPass;

    public Password(String plainTextPass){
        this.plainTextPass = "0" + plainTextPass + "1";
    }

    public boolean checkPass(String pass){
        return plainTextPass.equals("0pass1");
    }
}
