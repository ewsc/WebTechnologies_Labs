package xyz.alamov.Task5;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Task5Tests {
    @Test
    public void test1() {
        int[] compare = {1, 6, 1, 12};
        boolean ok = Task5.findLeastNumberOfElements(compare) == 1;
        assertTrue("Failed", ok);
    }

    @Test
    public void test2() {
        int[] compare = {1, 6, -12, 11, 2, 12};
        boolean ok = Task5.findLeastNumberOfElements(compare) == 2;
        assertTrue("Failed", ok);
    }
}
