package homework.homework05;
/*
Created by R4
Написать программу, преобразующую строку, содержащую число в
римском формате, в число в арабском формате.
Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ
идёт перед большим:
Например CM == 900.
Соответствие:
M 1000
D 500
C 100
L 50
X 10
V 5
I 1
 */

public class Task2 {
    public static void main(String[] args) {
        StringBuilder romanNum = new StringBuilder("MDMCDXCIX");

        if (romanNum.charAt(3) == (char) 'M') {
            System.out.println("введите меньшее число");
        } else {
            System.out.println(RomanInArabic(romanNum));
        }
    }

    public static int RomanInArabic(StringBuilder romanNumIn) {
        char[] romanNumberals = new char[] {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] arabicNumberals = new int[] {1, 5, 10, 50, 100, 500, 1000};
        int[] forSum = new int[romanNumIn.length()];

        romanNumIn = romanNumIn.reverse();

        for (int i = 0; i < romanNumIn.length(); i++) {
            for (int j = 0; j < romanNumberals.length; j++) {
                if (romanNumberals[j] == romanNumIn.charAt(i)) {
                    forSum[i] = arabicNumberals[j];
                }
            }
        }

        int fullSum = forSum[0];
        for (int i = 0; i < forSum.length - 1; i++) {
            if (forSum[i + 1] >= forSum[i]) {
                fullSum = fullSum + forSum[i + 1];
            } else {
                fullSum = fullSum - forSum[i + 1];
            }
        }

        return fullSum;
    }
}
