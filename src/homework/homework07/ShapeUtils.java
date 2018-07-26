package homework.homework07;

import homework.homework07.figures.Figure;
import homework.homework07.figures.Quadrangle;
import homework.homework07.figures.Rectangle;
import homework.homework07.figures.Triangle;

public class ShapeUtils {

    public static void whatIsFigure(Figure someFigure) {

        if (someFigure instanceof Triangle) {
            System.out.println("Данная фигура : Треугольник");
        } else if (someFigure instanceof Quadrangle) {
            System.out.println("Данная фигура : Четырехугольник");
        } else {
            System.out.println("Данная фигура не является треугольником или четырехугольником");
        }
    }
}
