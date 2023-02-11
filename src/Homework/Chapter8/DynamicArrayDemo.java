package Homework.Chapter8;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);


        da.print();
        System.out.println(da.getIndexByValue(2));
        da.print();
    }

}
