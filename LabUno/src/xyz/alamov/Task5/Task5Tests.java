package xyz.alamov.Task5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task5Tests {
    @Test
    public void test1() {
        int[] compare = {1, 6, 1, 12};
        assertEquals("Failed", 1, Task5.findLeastNumberOfElements(compare));
    }

    @Test
    public void test2() {
        int[] compare = {1, 6, -12, 11, 2, 12};
        assertEquals("Failed", 2, Task5.findLeastNumberOfElements(compare));
    }
}
