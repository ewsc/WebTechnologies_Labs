package xyz.alamov.Task7;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class Task7Tests {
    @Test
    public void test1() {
        double[] testingArray = {1.1, 0.7, 12.3, 9.1, 0.1};
        double[] manuallySorted = {0.1, 0.7, 1.1, 9.1, 12.3};
        boolean ok = Arrays.equals(manuallySorted, Task7.sortYourTrash(testingArray));
        assertTrue("Failed", ok);
    }
}
