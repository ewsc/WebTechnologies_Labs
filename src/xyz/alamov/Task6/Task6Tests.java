package xyz.alamov.Task6;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class Task6Tests {
    @Test
    public void test1() {
        double[][] comparingMatrix = new double[5][5];
        comparingMatrix[0][0] = 1;
        comparingMatrix[0][1] = 2;
        comparingMatrix[0][2] = 3;
        comparingMatrix[0][3] = 4;
        comparingMatrix[0][4] = 5;

        comparingMatrix[1][0] = 2;
        comparingMatrix[1][1] = 3;
        comparingMatrix[1][2] = 4;
        comparingMatrix[1][3] = 5;
        comparingMatrix[1][4] = 1;

        comparingMatrix[2][0] = 3;
        comparingMatrix[2][1] = 4;
        comparingMatrix[2][2] = 5;
        comparingMatrix[2][3] = 1;
        comparingMatrix[2][4] = 2;

        comparingMatrix[3][0] = 4;
        comparingMatrix[3][1] = 5;
        comparingMatrix[3][2] = 1;
        comparingMatrix[3][3] = 2;
        comparingMatrix[3][4] = 3;

        comparingMatrix[4][0] = 5;
        comparingMatrix[4][1] = 1;
        comparingMatrix[4][2] = 2;
        comparingMatrix[4][3] = 3;
        comparingMatrix[4][4] = 4;

        double[] testingMatrix = {1, 2, 3, 4, 5};

        boolean ok = Arrays.deepEquals(comparingMatrix, Task6.escapeMatrix(testingMatrix));
        assertTrue("Failed", ok);
    }

}
