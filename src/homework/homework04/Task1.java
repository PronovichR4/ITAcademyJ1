package homework.homework04;
/*
Created by R4
Напишите программу, которая циклически сдвигает элементы
        массива вправо на одну позицию, и печатает результат.
        Цикличность означает, что последний элемент массива становится
        самым первым его элементом. */

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int numbers : array) {
            System.out.print(numbers + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int numbers : newArray(array)) {
                System.out.print(numbers + " ");
            }
            array = newArray(array);
        }
    }

    public static int[] newArray(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                newArray[0] = array[array.length - 1];
            } else {
                System.arraycopy(array, i - 1, newArray, i, array.length - 1);
            }
        }

        return newArray;
    }
}
