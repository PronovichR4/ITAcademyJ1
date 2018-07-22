package classwork.lesson03;

public class Task6 {
    public static void main(String[] args) {
        int inputValue=999;
        Method1(inputValue);

        int result=0;
        for (inputValue = 999; inputValue !=0 ; inputValue/=10) {
            int lastNumber = inputValue % 10;
            result+=lastNumber;
        }
        System.out.println(result);
    }

    private static void Method1(int inputValue) {
        int result=0;
        while (inputValue !=0){
            int lastNumber = inputValue % 10;
            result+=lastNumber;
            inputValue/=10;
        }
        System.out.println(result);
    }
}
