package classwork.lesson02;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int lastdigit=x%10;
        int preLastDigit=x%100;


        System.out.println("Введите количество сумму:");
        if ((lastdigit>=5 && lastdigit<=9 || lastdigit==0) || (preLastDigit>=11 && preLastDigit<=19))
        {
            System.out.println(x + " рублей");

        }
        else if (2<=lastdigit && lastdigit<=4){
            System.out.println(x + " рубля");
        }
        else {
            System.out.println(x +" рубль");
        }

    }


}
