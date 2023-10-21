package xyz.alamov.Task14;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class Task14Tests {
    @Test
    public void test1() {
        Book book = new Book("Title", "SomeAuthor", 300, 1);
        Book clonedBook = (Book) book.clone();

        assertEquals(book, clonedBook);
        assertNotSame(book, clonedBook);
    }

    @Test
    public void test2() {
        Book book1 = new Book("BookA", "AuthorA", 300, 1);
        Book book2 = new Book("BookA", "AuthorA", 300, 1);
        boolean ok = book1.equals(book2);
        assertTrue("Failed", ok);
    }
}
