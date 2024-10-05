package ru.mirea.practice.s23L0908.n2;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1.0, 2.0);

        System.out.println("Initial: " + ball);

        ball.move(3.0, 4.0);
        System.out.println("After moving: " + ball);

        ball.setXY(0.0, 0.0);
        System.out.println("After setting coordinates to (0.0, 0.0): " + ball);
    }
}
