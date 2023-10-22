package xyz.alamov.Task16;

import java.util.Comparator;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int hashCode() {

        return 10 * title.hashCode() + 31 * author.hashCode() + 20456;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Book)) return false;

        Book book = (Book) obj;
        return this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;
    }

    @Override
    public String toString() {
        return "Title:" + title + "|Author:" + author + "|Price:" + price + "|Edition:" + edition;
    }

    public static Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
    public static Comparator<Book> authorComparator = Comparator.comparing(Book::getAuthor);
    public static Comparator<Book> priceComparator = Comparator.comparingInt(Book::getPrice);


    public static Comparator<Book> authorTitleComparator = Comparator.comparing(Book::getAuthor).thenComparing(titleComparator);
    public static Comparator<Book> titleAuthorComparator = Comparator.comparing(Book::getTitle).thenComparing(authorComparator);
    public static Comparator<Book> authorTitlePriceComparator = authorComparator.thenComparing(titleComparator).thenComparing(priceComparator);
}
