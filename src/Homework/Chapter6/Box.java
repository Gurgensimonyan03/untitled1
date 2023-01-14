package Homework.Chapter6;

public class Box {
    double width;
    double height;
    double depth;

     String color ;
    void volume () {
        System.out.print(" ОБЬЕМ РАВЕН");
        System.out.println(width * height* depth);
    }
    void aboutbox(){
        System.out.println("About your box");
        System.out.println (  "width = "+width );
        System.out.println ( "height ="+ height );
        System.out.println ( "height = "+ depth );
        System.out.println ( "color = "+ color );

    }

}
