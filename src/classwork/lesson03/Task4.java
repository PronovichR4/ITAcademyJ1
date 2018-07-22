package classwork.lesson03;

public class Task4 {
    public static void main(String[] args) {
    for (char value='b'; !Check(value); value++){
        System.out.println(value);
    }
    }
    private static boolean Check (char value){
        return value=='a' || value =='e' || value=='u' || value=='i' || value=='o' || value=='y';

    }

    private static boolean Check2 (char value){
        return "aeuioy".contains(String.valueOf(value));
    }
}
