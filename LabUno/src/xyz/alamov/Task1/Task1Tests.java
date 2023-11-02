package xyz.alamov.Task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task1Tests {
    @Test
    public void test(){
        double x = 0;
        double y = 0;
        double res = Task1.calc(x ,y);
        assertEquals("failed", 0, Double.compare(res, 0.5));
    }
}
