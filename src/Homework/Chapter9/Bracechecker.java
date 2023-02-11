package Homework.Chapter9;

public class Bracechecker {

    private String text;

    public Bracechecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case '{':
                    stack.push(c);
                    break;
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    int last = stack.pop();
                    if (last == 0){
                        System.out.println("error at " + i + "close not opened");
                    }else {
                        char lastBracket = (char) last;
                        if (lastBracket!='('){
                            System.out.println("Error at "+ i + "opened" + lastBracket + "but closed"+ c);
                        }
                    }
            }
        }
    }
}
