package xyz.alamov.Task9;

import org.junit.Test;

import java.awt.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class Task9Tests {
    @Test
    public void test1() {
        Bucket bucket = new Bucket(15);
        Ball ball1 = new Ball(1, Color.BLUE);
        Ball ball2 = new Ball(1, Color.GREEN);
        Ball ball3 = new Ball(1, Color.GREEN);
        Ball ball4 = new Ball(1, Color.BLUE);
        Ball ball5 = new Ball(1, Color.BLUE);
        bucket.addBall(ball1);
        bucket.addBall(ball2);
        bucket.addBall(ball3);
        bucket.addBall(ball4);
        bucket.addBall(ball5);

        assertEquals("Failed", 3, bucket.countBlue());
    }

    @Test
    public void test2() {
        Bucket bucket = new Bucket(15);
        Ball ball1 = new Ball(1, Color.BLUE);
        Ball ball2 = new Ball(1, Color.GREEN);
        Ball ball3 = new Ball(1, Color.GREEN);
        Ball ball4 = new Ball(1, Color.BLUE);
        Ball ball5 = new Ball(1, Color.BLUE);
        bucket.addBall(ball1);
        bucket.addBall(ball2);
        bucket.addBall(ball3);
        bucket.addBall(ball4);
        bucket.addBall(ball5);

        assertEquals("Failed", 5, bucket.countWeight());
    }
}
