package classwork.lesson04;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array= new int[100];
        for (int i = 0, counter=13; i <array.length ; i++) {
            while (true){
                if(counter%13==0 || counter%17==0){
                    array[i]=counter;
                    counter++;
                    break;
            }
           counter++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
