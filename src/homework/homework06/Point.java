package homework.homework06;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((Math.pow(x, 2))  + (Math.pow(y, 2)));
    }

    public double distance(Point point) {
        return Math.sqrt((Math.pow(x - point.x, 2))  + (Math.pow(y - point.y, 2)));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}