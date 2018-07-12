package homework.homework03;
/*
Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(summa(n));
    }

    static int summa(int n) {
        int s = 0;
        while (n > 0) {
            int s1 = n % 10;
            s += s1;
            n = n / 10;

        }
        return s;
    }
}