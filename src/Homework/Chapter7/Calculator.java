package Homework.Chapter7;

public class Calculator {
    double a;
    double b;
     double plus(double a,double b){
        return a + b;
    }
    double minus(double a, double b){
         return a-b;
    }
    double divide(double a, double b){
         if (b!=0)
         return a/b;
         else return -1;
    }
    double multiply(double a ,double b){
         return a*b;

    }
}
