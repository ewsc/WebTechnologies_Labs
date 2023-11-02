package xyz.alamov.Task2;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Task2Tests {
    @Test
    public void test1() {
        double x, y = x = 0;
        boolean res = Task2.getRegion(x, y);
        assertTrue("Failed", res);
    }

    @Test
    public void test2() {
        double x = -4;
        double y = 0.1;
        boolean res = Task2.getRegion(x, y);
        assertTrue("Failed", res);
    }

    @Test
    public void test3() {
        double x = -6;
        double y = -3.1;
        boolean res = !Task2.getRegion(x, y);
        assertTrue("Failed", res);
    }

    @Test
    public void test4() {
        double x = -6;
        double y = -3;
        boolean res = Task2.getRegion(x, y);
        assertTrue("Failed", res);
    }

    @Test
    public void test5() {
        double x = -6;
        double y = 0;
        boolean res = !Task2.getRegion(x, y);
        assertTrue("Failed", res);
    }

    @Test
    public void test6() {
        double x = 0;
        double y = 6;
        boolean res = !Task2.getRegion(x, y);
        assertTrue("Failed", res);
    }
}
