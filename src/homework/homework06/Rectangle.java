package homework.homework06;

public class Rectangle {
    private Point pointA;
    private Point pointB;

    public Rectangle(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public double areaRectangle() {
        double a = Math.abs(pointA.getX() - pointB.getX());
        return a * Math.sqrt((Math.pow(pointA.distance(pointB), 2) - Math.pow(a, 2)));
    }

    public double lengthDiagonal() {
        return pointA.distance(pointB);
    }
}
