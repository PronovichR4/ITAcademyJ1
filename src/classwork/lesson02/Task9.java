package classwork.lesson02;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(shiftChar('a',4));

    }
    private static char shiftChar (char a, int b){
        char c= (char)(a+b);
        return c;
    }
}
