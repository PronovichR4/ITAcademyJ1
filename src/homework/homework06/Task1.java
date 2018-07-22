package homework.homework06;
/*
Создать класс Point, описывающий точку в двумерных
координатах.
Полями этого класса должны быть координаты x и y.
Класс должен иметь один конструктор, принимающий координаты
x и y.
Сделайте информацию о координатах скрытой, а получить её
можно только с помощью методов доступа (get/set).
Создать метод distance, принимающий объект Point и
определяющий расстояние до неё.
Используя класс точки, создать класс Rectangle, описывающий
прямоугольник.
В нём хранятся два поля типа Point - координаты левого верхнего и
правого нижнего углов.
Создать следующие методы в классе Rectangle:
- Высчитывающий площадь прямоугольника
- Высчитывающий длину диагонали
Написать тестовый класс с методом main программу,
демонстрирующим создание объекта класса Rectangle и
применение вышеперечисленных методов.
 */

public class Task1 {
    public static void main(String[] args) {
        Point pointOne = new Point(2, 3);
        Point pointTwo = new Point(5, 7);
        System.out.println(pointOne.getX() + ", " + pointOne.getY());
        System.out.println(pointTwo.getX() + ", " + pointTwo.getY());

        Rectangle rectangle = new Rectangle(pointOne, pointTwo);
        System.out.println("Длинна диагонали "+rectangle.lengthDiagonal());
        System.out.println("Площадь прямоугольника "+rectangle.areaRectangle());

    }
}
