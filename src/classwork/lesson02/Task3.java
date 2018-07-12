package classwork.lesson02;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("введите первое слово");
        String s1=sc.next();
        System.out.println("введите второе слово");
        String s2=sc.next();
        check(s1, s2);
    }

    private static void check(String s1, String s2) {
        if (s1.equals(s2)){
            System.out.println("Отлично! Слова одинаковы");
        }
        else if (s1.equalsIgnoreCase(s2)){
            System.out.println("Хорошо. Почти одинаковы");
        }
        else if (s1.length()==s2.length()){
            System.out.println("Ну, хотя бы они одной длины");
        }
    }
}
