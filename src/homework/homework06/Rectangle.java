package homework.homework06;

public class Rectangle {

    private Point leftUpPoint;
    private Point rightDownPoint;

    public Rectangle(Point leftUpPoint, Point rightDownPoint) {
        this.leftUpPoint = leftUpPoint;
        this.rightDownPoint = rightDownPoint;
    }

    public int area (Point leftUpPoint, Point rightDownPoint){
        return Math.abs((rightDownPoint.getX()-leftUpPoint.getX())*(leftUpPoint.getY()-rightDownPoint.getY()));
    }

    public double diagonalLength (){
        return Math.abs(leftUpPoint.distance(rightDownPoint));
    }
}
