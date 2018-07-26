package homework.homework07.figures;

public class Circle extends Figure {

    public Circle(Point pointA, Point pointB) {
        super("Круг", pointA, pointB);
    }

    @Override
    public double perimetrOfFigure() {
        return 2 * Math.PI * radiusOfCircle();
    }

    @Override
    public double areaOfFigure() {
        return Math.PI * Math.pow(radiusOfCircle(), 2);
    }

    public double radiusOfCircle() {
        return getPointA().distance(getPointB());
    }

    @Override
    public String toString() {
        return "Название фигуры:" + getName() + " Площадь фигуры:" + perimetrOfFigure() + " Периметр фигуры:" + areaOfFigure();

    }
}
