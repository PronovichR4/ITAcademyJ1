package classwork.lesson04;

import java.util.Arrays;
import java.util.Random;

public class Task10 {

    public static void main(String[] args) {
        char[][] array = {
                {'1', '1', '1', '1', '1'},
                {'0', '1', '1', '1', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '1'},
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == '1') {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }

            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));

        }
    }
}


