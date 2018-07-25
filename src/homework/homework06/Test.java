package homework.homework06;
/*
Created by R4
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

public class Test {

    public static void main(String[] args) {

        Point one = new Point(2, 1);
        Point two = new Point(5, -3);

        Rectangle rectangle = new Rectangle(one, two);


        System.out.println("Плозадь квадрата= " + rectangle.area(one, two));
        System.out.println("Длинна диагонали= " + rectangle.diagonalLength());

    }

}