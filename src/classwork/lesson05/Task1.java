package classwork.lesson05;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        String firstValue="aab";
        String secondValue="bab";
        System.out.println(firstValue.compareTo(secondValue));
        System.out.println(firstValue.concat(secondValue));

       // testBuilder();
       // simpleString();
    }

    private static void testBuilder() {
        StringBuilder stringBuilder= new StringBuilder()
                .append("first")
                .append("second")
                .append("third");
        System.out.println(stringBuilder.toString());
    }

    private static void simpleString() {
        Random rand = new Random();
        final int countRandom = 10_000;

        String result = "";
        long start=System.nanoTime();
        for (int i = 0; i < countRandom; i++) {
            result += rand.nextInt(1000000);
        }
        long end=System.nanoTime();
        long totaltime=end-start;
        System.out.println("Время выполнения: "+ totaltime);
    }


}
