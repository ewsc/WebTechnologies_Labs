package xyz.alamov.Task15;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;
    public Book(){}

    public Book(String title, String author, int price, int edition, String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        setEdition(edition);
    }

    public void setEdition(int edition) {
        Book.edition = edition;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public int hashCode(){
        return 10 * title.hashCode() + 31 * author.hashCode() + 20456;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;
    }

    @Override
    public String toString(){
        return "Title: " + title + " | Author: " + author + " | Price: " + price + " | Edition: " + edition + " | isbn :"+ isbn;
    }

    @Override
    public int compareTo(Book o) {
        return this.isbn.compareTo(o.isbn);
    }
}
