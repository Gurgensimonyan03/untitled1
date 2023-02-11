package Homework.Chapter9;

public class BraceChackerDEMO {
    public static void main(String[] args) {


        String text = "hello {sf}asf";
        Bracechecker bracechecker = new Bracechecker(text);
        bracechecker.check();
    }
}
