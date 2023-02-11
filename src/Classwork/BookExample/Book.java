package Classwork.BookExample;

public class Book {
    String title;
    double price;
    String author;

    public Book(String title, double v, String author) {
    }

    public Book(String title, int price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Book) {
            Book b = (Book) obj;
            return title.equals(b.title)
                    && price == b.price
                    && author.equals(b.author);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
