package homework.homework07.figures;

public abstract class Triangle extends Figure {

    private Point pointC;

    public Triangle(String name, Point pointA, Point pointB, Point pointC) {
        super(name, pointA, pointB);
        this.pointC = pointC;
    }

    public abstract double perimetrOfFigure();

    public abstract double areaOfFigure();

    public double lengthOfHypotenuse() {
        return Math.max(Math.max(lengthOfSideA(), lengthOfSideB()), lengthOfSideC());
    }

    public double lengthOfSideA() {
        return getPointA().distance(getPointB());
    }

    public double lengthOfSideB() {
        return getPointB().distance(getPointC());
    }

    public double lengthOfSideC() {
        return getPointC().distance(getPointA());
    }


    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
}
