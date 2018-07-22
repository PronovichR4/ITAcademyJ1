package classwork.lesson03;

public class Task7 {
    public static void main(String[] args) {
        int inputValue=20023143;
        int counter=3;
        String result="";
        while (inputValue!=0){
            int ostatok=inputValue%10;
            counter--;
            result=ostatok+result;
            if (counter==0){
            result=" "+result;
            counter=3;
            }
            inputValue/=10 ;

        }
        System.out.println(result.trim());
    }
}
