package Homework.Chapter10Employe;

import Classwork.BookExample.Book;

public class EmployeStorage {
    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private static Employe[] array = new Employe[10];
    private static int size = 0;


    public static void add(Employe value) {
        if (size == array.length)
            extend();

        array[size++] = value;
    }


    private static  void extend() {
        Employe[] newArray = new Employe[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
//    public static void searchByName(String keyword) {
//        boolean found = false;
//        for (int i = 0; i < size; i++) {
//            Book book = array[i];
//            if (book.getTitle().contains(keyword)){
//                System.out.println(book);
//            }
//        }
//        if (!found){
//            System.out.println("book with" + keyword +" does not exists" );



    //տպել մասիվի ավելացված էլեմենտները
    public  static void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
            return;

        }


    }


    public static void searchByID(String id) {
      boolean found = false;
        for (int i = 0; i < size; i++) {
            Employe employe = array[i];
            if (Employe.getEmpleyeID().contains(id)){
                System.out.println(employe);
                break;
            }
            if (!found){
                System.out.println("Employe with this id-"+id+ "does not found");
            }
        }

    }

    public static void searchByCompany(String companyname) {
        boolean found = false;

        for (int i = 0; i <size ; i++) {
            Employe employe = array[i];
            if (Employe.getCompany().contains(companyname))
                System.out.println(employe);
        }
    }
}
