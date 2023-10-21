package xyz.alamov.Task3;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Task3Tests {
    @Test
    public void test1() {
        double x = -2;
        boolean res = Task3.returnFuncValue(x) == Math.tan(-2);
        assertTrue("Failed", res);
    }
}
