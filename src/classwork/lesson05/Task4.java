package classwork.lesson05;

public class Task4 {
    public static void main(String[] args) {
        String firsNmae="Ivan";
        String secondName="andrey";
        String patronimycName="Ptrovich";
        System.out.println(format(firsNmae,secondName,patronimycName));
    }
    private static String format(String first, String second, String third ){
        char firstChar=first.charAt(0);
        char secondChar=second.charAt(0);
        char thirdChar=third.charAt(0);
        return (firstChar+ "."+ secondChar+ "."+thirdChar).toUpperCase();
    }
}
