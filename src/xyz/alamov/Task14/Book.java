package xyz.alamov.Task14;

public class Book implements Cloneable {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price, int edition){
        this.title = title;
        this.author = author;
        this.price = price;
        setEdition(edition);
    }

    public void setEdition(int edition) {
        Book.edition = edition;
    }

    public static int getEdition() {
        return edition;
    }

    @Override
    public int hashCode() {
        return 11 * title.hashCode() + 31 * author.hashCode() + Integer.valueOf(price).hashCode() * 113 + 20456;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) {
            return false;
        }
        if (obj.hashCode() != hashCode()) {
            return false;
        }
        Book book = (Book) obj;
        return this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;
    }

    @Override
    public Object clone() {
        try {
            Book clonedBook = (Book) super.clone();
            clonedBook.setEdition(getEdition());
            return clonedBook;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("CloneNotSupportedException should not occur.");
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + " | Author: " + author + " | Price: " + price + " | Edition: " + edition;
    }
}
