package homework.homework01;
/*
Created by R4
Имеются два дома размерами a на b и c на d. Размеры вводятся польователем с консоли.
Проверить, помещаются ли эти дома на участке размерами e на f.
Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        int e = 10; //размер участка
        int f = 8; //размер участка
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (isCheck(e, f, a, b, c, d)) {
            System.out.println("House is approved");
        } else {
            System.out.println("House is refused");
        }
    }

    static boolean isCheck(int e, int f, int a, int b, int c, int d) {
        int s = e * f;
        int s1 = a * b;
        int s2 = c * d;
        if (s < (s1 + s2)) {
            return false;
        } else if (e >= (a + c) && f >= b && f >= d) {
            return true;
        } else if (e >= (a + d) && f >= b && f >= c) {
            return true;
        } else if (e >= (b + d) && f >= a && f >= c) {
            return true;
        } else if (e >= (b + c) && f >= a && f >= d) {
            return true;
        } else if (f >= (a + c) && e >= b && e >= d) {
            return true;
        } else if (f >= (a + d) && e >= b && e >= c) {
            return true;
        } else if (f >= (b + d) && e >= a && e >= c) {
            return true;
        } else if (f >= (b + c) && e >= a && e >= d) {
            return true;
        } else {
            return false;
        }
    }
}