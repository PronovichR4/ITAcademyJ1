package homework.homework04;
/*
Created by R4
Заданы 2 массива целых чисел произвольной длины.
Написать программу, создающую третий массив,
представляющий собой слияние 2-х заданных.
 */

public class Task3 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] array2 = { 5, 6, 7 };

        for (int numbers : newArray(array, array2)) {
            System.out.print(numbers + " ");
        }
    }

    public static int[] newArray(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < newArray.length; ) {
            if (counter1 < array1.length) {
                newArray[i] = array1[counter1];
                i++;
                counter1++;
            }
            if (counter2 < array2.length) {
                newArray[i] = array2[counter2];
                i++;
                counter2++;
            }
        }

        return newArray;
    }
}
