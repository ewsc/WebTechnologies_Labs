package xyz.alamov.Task4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task4Tests {
    @Test
    public void test1() {
        assertTrue("Failed", Task4.checkForOptimusPrime(113));
    }

    @Test
    public void test2() {
        assertFalse("Failed", Task4.checkForOptimusPrime(12));
    }

    @Test
    public void test3() {
        ArrayList<Integer> itsAllAboutPositioning = new ArrayList<>();
        itsAllAboutPositioning.add(1);
        itsAllAboutPositioning.add(3);
        int[] checkingArray = {12, 17, 18, 11};
        boolean ok = Objects.equals(itsAllAboutPositioning, Task4.returnPositions(checkingArray));
        assertTrue("Failed", ok);
    }
}
