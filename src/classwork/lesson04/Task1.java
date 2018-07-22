package classwork.lesson04;

public class Task1 {
    public static void main(String[] args) {
        char[] array = {'a', 't', '1', 'j', 'q'};
        for (char i : array        ) {
            System.out.println(i + " ");

        }
        for (int i=array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }
    }
}
