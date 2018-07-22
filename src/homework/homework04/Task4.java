package homework.homework04;
/*
Created by R4
Написать функцию linearize, которая принимает в качестве
параметра двумерный массив
и возвращает одномерный массив со всеми элементами
двумерного.
 */

public class Task4 {
    public static void main(String[] args) {
        int[][] biArray = new int[5][];

        for (int i = 0; i < biArray.length; i++) {
            biArray[i] = new int[i + 3];
            for (int j = 0; j < biArray[i].length; j++) {
                biArray[i][j] = i + 1 + j + 1;
            }
        }

        for (int[] numI : biArray) {
            for (int numJ : numI) {
                System.out.print(numJ);
            }
            System.out.println();
        }

        System.out.println();


        for (int numbers : linearize(biArray)) {
            System.out.print(numbers + " ");
        }
    }

    public static int[] linearize(int[][] biArray) {


        int lengthArray = 0;
        for (int[] numI : biArray) {
            for (int numJ : numI) {
                lengthArray++;
            }
        }

        int[] newArray = new int[lengthArray];
        lengthArray = 0;

        for (int i = 0; i < biArray.length; i++) {
            for (int numI : biArray[i]) {
                System.arraycopy(biArray[i], 0, newArray, lengthArray, biArray[i].length);
            }
            lengthArray = lengthArray + biArray[i].length;
        }

        return newArray;
    }
}
