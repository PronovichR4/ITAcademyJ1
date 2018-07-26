package homework.homework07.figures;

public abstract class Quadrangle extends Figure {


    public Quadrangle(String name, Point pointA, Point pointB) {
        super(name, pointA, pointB);
    }

    public abstract double perimetrOfFigure();

    public abstract double areaOfFigure();


}
