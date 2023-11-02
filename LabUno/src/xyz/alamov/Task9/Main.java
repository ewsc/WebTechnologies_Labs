package xyz.alamov.Task9;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball(1, Color.GREEN);
        Ball ball2 = new Ball(2, Color.BLUE);
        Ball ball3 = new Ball(7, Color.BLUE);
        Ball ball4 = new Ball(4, Color.BLUE);
        Ball ball5 = new Ball(3, Color.GREEN);
        Ball ball6 = new Ball(13, Color.GREEN);

        Bucket bucket = new Bucket(22);

        bucket.addBall(ball1);
        bucket.addBall(ball2);
        bucket.addBall(ball3);
        bucket.addBall(ball4);
        bucket.addBall(ball5);
        bucket.addBall(ball6);

        System.out.println(bucket.countBlue());
        System.out.println(bucket.countWeight());
    }
}
