package homework.homework05;
/*
Created by R4
Проверить, является ли введённая строка палиндромом, т.е. читается
одинаково в обоих направлениях
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder(sc.nextLine());

        if (strBuild.toString().toLowerCase().trim().equals(strBuild.reverse().toString().trim().toLowerCase())){
            System.out.println("Polindrom");
        } else {
            System.out.println("not Polindrom");
        }
    }
}
