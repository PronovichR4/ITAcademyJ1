package homework.homework04;
/*
Created by R4
Написать программу, удаляющую все повторяющиеся целые
числа из массива и печатающую результат.
 */

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(5);
        }

        for (int numbers: array) {
            System.out.print(numbers + " ");
        }

        System.out.println();

        for (int numbers: singleArray(array)) {
            System.out.print(numbers + " ");
        }
    }

    public static int[] singleArray(int[] arrayIn) {
        boolean[] isDuplicate =new  boolean[arrayIn.length];
        int countDuplicate = 0;

        for (int i = 0; i < arrayIn.length; i++) {
            if (!isDuplicate[i]) {
                for (int j = i + 1; j < arrayIn.length; j++) {
                    if (arrayIn[i] == arrayIn[j]) {
                        isDuplicate[j] = true;
                        countDuplicate++;
                    }
                }
            }
        }

        int[] newArray = new int[arrayIn.length - countDuplicate];

        for (int i = 0, j = 0; i < arrayIn.length; i++) {
            if (!isDuplicate[i]) {
                newArray[j] = arrayIn[i];
                j++;
            }
        }

        return newArray;
    }
}
