package xyz.alamov.Task1;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Task1Tests {
    @Test
    public void test(){
        double x = 0;
        double y = 0;
        double res = Task1.calc(x ,y);
        boolean ok = Double.compare(res, 0.5) == 0;
        assertTrue("failed", ok);
    }
}
