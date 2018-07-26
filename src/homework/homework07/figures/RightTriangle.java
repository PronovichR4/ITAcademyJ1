package homework.homework07.figures;

public class RightTriangle extends Triangle implements HighOfFigure {

    public RightTriangle(Point pointA, Point pointB, Point pointC) {
        super("Прямоугольный треугольник", pointA, pointB, pointC);
    }

    @Override
    public double perimetrOfFigure() {
        return lengthOfSideA() + lengthOfSideB() + lengthOfSideC();
    }

    @Override
    public double areaOfFigure() {
        return 0.5 * (lengthOfSideA() * lengthOfSideB());
    }

    @Override
    public double calculateHigh() {
        return 2 * areaOfFigure() / lengthOfHypotenuse();
    }

    @Override
    public double lengthOfHypotenuse() {
        return super.lengthOfHypotenuse();
    }

    @Override
    public double lengthOfSideA() {
        return super.lengthOfSideA();
    }

    @Override
    public double lengthOfSideB() {
        return super.lengthOfSideB();
    }

    @Override
    public double lengthOfSideC() {
        return super.lengthOfSideC();
    }

    @Override
    public String toString() {
        return "Название фигуры:" + getName() + " Площадь фигуры:" + perimetrOfFigure() + " Периметр фигуры:" + areaOfFigure();

    }
}
