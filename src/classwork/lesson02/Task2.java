package classwork.lesson02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        int year = sc.nextInt();
        if (isVesokos(year)) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не високосный");
        }

    }

    static boolean isVesokos(int year) {
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



