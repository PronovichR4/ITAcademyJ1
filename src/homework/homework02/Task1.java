package homework.homework02;

import java.util.Scanner;

/*
Created by R4
Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
    Вывести дату следующего дня в формате "День.Месяц.Год".
    Учесть переход на следующий месяц, а также следующий год.
    Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.

*/
public class Task1 {


        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            nextday(day, month, year);
        }
        static void nextday(int day, int month, int year) {
            if (vesokos(year) && day == 29 && month == 2) {
                day = 1;
                month++;
                System.out.println("Day:" + day + " month:" + month + " year:" + year);
            } else if (day == 31 && month == 12) {
                day = 1;
                month = 1;
                year++;
                System.out.println("Day:" + day + " month:" + month + " year:" + year);
            } else if (day == 31) {
                day = 1;
                month++;
                System.out.println("Day:" + day + " month:" + month + " year:" + year);
            } else if (vesokos(year) == false && day == 28 && month == 2) {
                day = 1;
                month++;
                System.out.println("Day:" + day + " month:" + month + " year:" + year);
            } else if (day == 30 && (month == 4 || month == 7 || month == 9 || month == 11)) {
                day = 1;
                month++;
                System.out.println("Day:" + day + " month:" + month + " year:" + year);
            } else {
                day++;
                System.out.println("Day:" + day + " month:" + month + " year:" + year);
            }
        }
        static boolean vesokos(int year) {
            if (year % 400 == 0) {
                return true;
            } else if (year % 100 == 0 && year % 400 != 0) {
                return false;
            } else if (year % 100 != 0 && year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
}



