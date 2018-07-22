package classwork.lesson03;

public class Task3 {
    public static void main(String[] args) {
        int inputValue=6;

        System.out.println( getResult(inputValue));
    }
private  static int factorialRec(int value){
        if (value==1){
            return value;
        }
else {
            return value*factorialRec(--value);
        }
}

    private static int getResult(int inputValue) {

        int result =1;
        for (int i=1; i<=inputValue; i++ ){
            result=result*i;
        }
        return result;
    }
}
