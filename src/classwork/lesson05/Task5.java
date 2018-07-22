package classwork.lesson05;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String[] firstValue={"first", "second", "third"};
        String[] secondValue={"second", "first", "third"};
    }
    private static boolean equals (String[] first, String[] second){
        boolean result=true;
        if (first.length!=second.length){
            result= false;
        }
        else {
            Arrays.sort(first);
            Arrays.sort(second);
            for (int i = 0; i <first.length ; i++) {
                if (!first[i].equals(second[i])){
                    result=false;
                    break;
                }

            }
        }
        return true;
    }
}
