package Classwork.BookExample;

public class BookStorage {
    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private static Book[] array= new Book[10];
    private static int size = 0;




    public void add(Book value) {
        if (size == array.length)
            extend();

        array[size++] = value;
    }


    private void extend() {
        Book[] newArray = new Book[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
    public static void searchByName(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Book book = array[i];
            if (book.getTitle().contains(keyword)){
                System.out.println(book);
            }
        }
        if (!found){
            System.out.println("book with" + keyword +" does not exists" );
        }
    }


    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
            return;

        }


    }


}
