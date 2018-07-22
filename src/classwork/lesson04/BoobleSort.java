package classwork.lesson04;

import java.sql.SQLOutput;
import java.util.Arrays;

public class BoobleSort {
    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8, 10, 5, 1, 7, 11, 3};

        sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println(Arrays.toString(array));

    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}