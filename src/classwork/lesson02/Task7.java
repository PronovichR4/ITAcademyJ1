package classwork.lesson02;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();


    }

   // static boolean isTrue(int day, int month, int year){

//return b;
    //}
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
