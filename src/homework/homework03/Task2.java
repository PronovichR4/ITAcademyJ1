package homework.homework03;
/*
Created by R4
Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
    Решить двумя способами: с помощью цикла и с помощью рекурсии.

 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        fibonachi(f);
    }

    static void fibonachi(int f) {
        int a = 0;
        int b = 1;
        int n = 0;
        while (n < f) {
            n = a + b;
            a = b;
            b = n;
            if (n >= f) {
                break;
            } else {
                System.out.println(n);
            }
        }
    }
}