package homework.homework07.figures;

public class Square extends Quadrangle {

    public Square(Point pointA, Point pointB) {
        super("Квадрат", pointA, pointB);
    }

    @Override
    public double perimetrOfFigure() {
        return lengthOfSideOfFigure() * 4;
    }

    @Override
    public double areaOfFigure() {
        return lengthOfSideOfFigure() * lengthOfSideOfFigure();
    }

    public double lengthOfSideOfFigure() {
        return getPointA().distance(getPointB());
    }

    @Override
    public String toString() {
        return "Название фигуры:" + getName() + " Площадь фигуры:" + perimetrOfFigure() + " Периметр фигуры:" + areaOfFigure();

    }
}
