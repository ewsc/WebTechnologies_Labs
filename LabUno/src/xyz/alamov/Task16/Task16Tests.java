package xyz.alamov.Task16;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class Task16Tests {
    @Test
    public void testTitle() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("C", "Author1", 20));
        books.add(new Book("B", "Author2", 25));
        books.add(new Book("A", "Author3", 30));

        books.sort(Book.titleComparator);
        assertEquals("A", books.get(0).getTitle());
        assertEquals("B", books.get(1).getTitle());
        assertEquals("C", books.get(2).getTitle());
    }

    @Test
    public void testAuthorTitlePrice() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("C", "Author1", 20));
        books.add(new Book("B", "Author1", 25));
        books.add(new Book("A", "Author2", 30));

        books.sort(Book.authorTitlePriceComparator);
        assertEquals("B", books.get(0).getTitle());
        assertEquals("C", books.get(1).getTitle());
        assertEquals("A", books.get(2).getTitle());
    }

    @Test
    public void testTitleAuthor() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("C", "Author1", 20));
        books.add(new Book("B", "Author3", 25));
        books.add(new Book("A", "Author1", 30));

        books.sort(Book.titleAuthorComparator);
        assertEquals("A", books.get(0).getTitle());
        assertEquals("B", books.get(1).getTitle());
        assertEquals("C", books.get(2).getTitle());
    }

    @Test
    public void testAuthorTitle() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("C", "Author1", 20));
        books.add(new Book("B", "Author3", 25));
        books.add(new Book("A", "Author1", 30));

        books.sort(Book.authorTitleComparator);
        assertEquals("A", books.get(0).getTitle());
        assertEquals("C", books.get(1).getTitle());
        assertEquals("B", books.get(2).getTitle());
    }
}
