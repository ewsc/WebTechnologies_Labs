package xyz.alamov.Task8;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Objects;

public class Task8Tests {
    @Test
    public void test1() {
        double[] a = {12, 17, 19, 23, 32};
        double[] b = {3, 4, 15, 21};
        ArrayList<Double> checking = new ArrayList<>();
        checking.add(0.0);
        checking.add(0.0);
        checking.add(1.0);
        checking.add(3.0);
        boolean ok = Objects.equals(Task8.printIndexes(a, b), checking);
        assertTrue("Failed", ok);
    }
}
