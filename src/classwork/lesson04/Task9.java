package classwork.lesson04;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[][] values =new int [2][];
        values[0]= new int[5];
        values[0][4]=99;
        values[1]= new int[2];
        for (int i = 0; i <values.length ; i++) {
            System.out.println(Arrays.toString(values[i]));

        }
    }
}
