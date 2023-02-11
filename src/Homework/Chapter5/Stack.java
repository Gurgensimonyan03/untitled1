package Homework.Chapter5;

public class Stack {
    private int[] array = new int[10];
    int size ;

    public void push(int value) {
        if (size == array.length)
            System.out.println("stack is full");
        else {
            array[++size] = value;
        }

    }

    public int pop() {
        if (size < 0) {
            System.out.println("wrong index");
            return 0;
        } else
            return array[size--];
    }

    public void print (){
        for (int i = 0; i < size+1; i++) {
            System.out.println(array[i]);
        }
    }


}
