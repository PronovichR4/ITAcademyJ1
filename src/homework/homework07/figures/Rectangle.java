package homework.homework07.figures;

public class Rectangle extends Quadrangle implements DiagonalOfRectangle {

    private Point pointC;

    public Rectangle(Point pointA, Point pointB, Point pointC) {
        super("Прямоугольник", pointA, pointB);
        this.pointC = pointC;
    }


    @Override
    public double calculateDiagonalOfRectangle() {
        return Math.sqrt(Math.pow(getPointA().distance(getPointB()), 2) + Math.pow(getPointB().distance(getPointC()), 2));
    }


    @Override
    public double perimetrOfFigure() {
        return (getPointA().distance(getPointB()) + getPointB().distance(getPointC())) * 2;
    }

    @Override
    public double areaOfFigure() {
        return getPointA().distance(getPointB()) * getPointB().distance(getPointC());
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Название фигуры:" + getName() + " Площадь фигуры:" + perimetrOfFigure() + " Периметр фигуры:" + areaOfFigure();

    }

}
