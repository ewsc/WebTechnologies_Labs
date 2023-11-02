package xyz.alamov.Task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task3Tests {
    @Test
    public void test1() {
        double x = -2;
        assertEquals("Failed", Task3.returnFuncValue(x), Math.tan(-2), 0.0);
    }
}
