package xyz.alamov.Task15;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class Task15Tests {
    @Test
    public void test1() {
        List<Book> unsortedShelf = new ArrayList<>();
        unsortedShelf.add(new Book("BookA", "AuthorA", 300, 1, "3"));
        unsortedShelf.add(new Book("BookB", "AuthorB", 300, 1, "1"));
        unsortedShelf.add(new Book("BookC", "AuthorC", 300, 1, "2"));
        Collections.sort(unsortedShelf);
        assertEquals("1", unsortedShelf.get(0).getIsbn());
        assertEquals("2", unsortedShelf.get(1).getIsbn());
        assertEquals("3", unsortedShelf.get(2).getIsbn());
    }
}
