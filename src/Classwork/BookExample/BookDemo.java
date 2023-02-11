package Classwork.BookExample;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();
        boolean isrun = true;
        while (isrun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add Book");
            System.out.println("please input 2 for print all book");
            System.out.println("please input 3 for search book by name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isrun = false;
                    break;
                case "1":
                    System.out.println("Please input books title");
                    String title = scanner.nextLine();
                    System.out.println("Please input books price");
                    String price = scanner.nextLine();
                    System.out.println("Please input books author");
                    String author = scanner.nextLine();
                    Book book = new Book(title, Double.parseDouble(price), author);
                    bookStorage.add(book);
                    System.out.println("Book is created");
                    break;
                case "2":
                    bookStorage.print();
                    break;
                case "3":
                    System.out.println("please input books keyword");
                    String keyword = scanner.nextLine();
                    BookStorage.searchByName(keyword);
                    break;
                default:
                    System.out.println("wrong command try again");
            }

        }


    }
}