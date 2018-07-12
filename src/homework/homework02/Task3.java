package homework.homework02;
/*
Created by R4
Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0, где a, b и c - вводимые
пользователем из консоли данные.
    Учитывать только реальные корни (в случае отрицательного дискриминанта выводить сообщение пользователю).
    При решении создать и использовать следующие вынесенные функции:
    - функция isPositive, определяющая, является ли число положительным
    - функция isZero, определяющая, является ли число нулём
    - функция discriminant, вычисляющая дискриминант
*/
import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {
        int a, b, c, x;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double d = discriminant(a, b, c);
        korni(a, b, c, d);
    }

    static double discriminant(int a, int b, int c) {
        double d = (b * b - 4 * a * c);
        return d;
    }

    static boolean isPositive(double d) {
        boolean a;
        if (d < 0) {
            a = false;
        } else {
            a = true;
        }
        return a;
    }

    static boolean isZero(double d) {
        boolean a;
        if (d == 0) {
            a = true;
        } else {
            a = false;
        }
        return a;
    }

    static void korni(int a, int b, int c, double d) {
        if (!isPositive(d)) {
            System.out.println("This task don't have answers");
        } else if (isZero(d)) {
            double x = -(b / 2 * a);
            System.out.println("Oba korni ravni:" + x);
        } else {
            double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
            double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
            System.out.println("x1=" + x1 + " x2=" + x2);
        }
    }
}
