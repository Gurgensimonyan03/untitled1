package Homework.Chapter;

public class Example {

    public static void main(String[] args) {
        int n = 100;
        double [] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        double max =  array[0];
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max< array[i])
            max = array[i];
            if ((min>array[i]));
            min = array[i];
        }
        System.out.println( "max = " +  max );
        System.out.println( "min = " + min );

        for (int i = 10; i < 20; i += 2) {
            if (i > 15)
                break;
            if (i % 4 == 0)
                continue;
            System.out.println (i);
        }

        }
    }

