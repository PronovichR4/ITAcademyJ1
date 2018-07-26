package homework.homework07.figures;

public abstract class Figure {

    private String name;
    private Point pointA;
    private Point pointB;


    public Figure(String name, Point pointA, Point pointB) {
        this.name = name;
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public abstract double perimetrOfFigure();

    public abstract double areaOfFigure();

    public String getName() {
        return name;
    }


    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void compareAreaShapes(Figure otherFigure) {
        if (areaOfFigure() > otherFigure.areaOfFigure()) {
            System.out.println("Площадь фигуры \"" + getName() + "\" больше фигуры \"" + otherFigure.getName() + "\"");
        } else if (areaOfFigure() < otherFigure.areaOfFigure()) {
            System.out.println("Площадь фигуры \"" + getName() + "\" меньше фигуры \"" + otherFigure.getName() + "\"");
        } else {
            System.out.println("Площадь фигуры \"" + getName() + "\" равна фигуре \"" + otherFigure.getName() + "\"");
        }
    }

}
