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
       // fibonachi(f);
        for (int i = 1; FibRec(i)<=f ; i++) {
            System.out.print(FibRec(i)+" ");

        }

    }

    static int FibRec(int f){
        if (f<=0){
            return 0;}
            else if (f==1){
                return 1;
            }
            else if (f==2){
            return 1;
        }
        else {
            return FibRec(f-1)+FibRec(f-2);
        }
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