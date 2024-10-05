package ru.mirea.practice.s23L0908.task3;

public class MovableRectangle implements Movable {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    public double xspeed;
    private double yspeed;

    public MovableRectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public MovableRectangle(double x1, double y1, double x2, double y2, double xspeed, double yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
        new MovableRectangle(x1, y1, x2, y2);
    }

    public String numberToString(double parametr) {
        return Double.toString(parametr);
    }

    @Override
    public boolean speedTest() {
        return yspeed == xspeed;
    }

    @Override
    public void moveRight(int x) {
        this.x1 += x;
        this.x2 += x;
    }

    @Override
    public void moveLeft(int x) {
        this.x1 -= x;
        this.x2 -= x;
    }

    @Override
    public void moveUp(int y) {
        this.y1 += y;
        this.y2 += y;
    }

    @Override
    public void moveDown(int y) {
        this.y1 += y;
        this.y2 += y;
    }

    @Override
    public String toString() {
        return "MovableRectangle: "
                + "x1=" + x1
                + ", y1=" + y1
                + ", x2=" + x2
                + ", y2=" + y2;
    }
}
