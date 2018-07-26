package homework.homework07;

import homework.homework07.figures.Figure;
import homework.homework07.figures.Point;
import homework.homework07.figures.Rectangle;
import homework.homework07.figures.Square;

public class Main {

    public static void main(String[] args) {

        Point pointA = new Point(2, 1);
        Point pointB = new Point(7, 1);
        Point pointC = new Point(7, 5);
        Point pointD = new Point(2, 5);

        Square square = new Square(pointA, pointB);
        Rectangle rectangle = new Rectangle(pointA, pointB, pointC);


        System.out.println(square.toString());
        System.out.println(rectangle.toString());

        square.compareAreaShapes(rectangle);

        ShapeUtils.whatIsFigure(square);


    }
}
