package homework.homework03;
/*
Created by R4
Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
    Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
    Программа должна выводить:
a. Количество дней
b. Сумму осадков за этот период
c. Среднее количество осадков за этот период
d. Максимальное количество дневных осадков за этот период
    Не использовать массивы!

 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int summa = 0;
        int osadkitemp = 0;
        for (int i = 1; i <= days; i++) {
            int osadki = sc.nextInt();
            summa += osadki;
            if (osadki > osadkitemp) {
                osadkitemp = osadki;
            }
        }
        int srednee = summa / days;
        System.out.println("Количество дней: "+days);
        System.out.println("Сумма осадков за данный период: "+ summa);
        System.out.println("Среднее количество осадков за данный период: "+srednee);
        System.out.println("Максимальное количество дневных осадков за этот период: "+osadkitemp);
    }
}
