package classwork.lesson04;

public class Task3 {
    public static void main(String[] args) {

        int[] array = {5, 2, 1, 4, 6, 8};
        System.out.println(minValueIndex(array));
        System.out.println(maxValueIndex(array));
        int minValueIndex1=minValueIndex(array);
        int maxValueIndex1=maxValueIndex(array);

        int startIndex=minValueIndex1<maxValueIndex1?minValueIndex1:maxValueIndex1;
        int endIndex=minValueIndex1>maxValueIndex1?minValueIndex1:maxValueIndex1;

        System.out.println( SummaIndex(array, startIndex, endIndex));

    }

    private static int SummaIndex(int[] array, int startIndex, int endIndex) {
        int summa=0;
        for (int i = startIndex+1; i <endIndex ; i++) {
            summa+=array[i];

        }
        return summa;
    }

    private static int minValueIndex(int[] array) {
        int minValueIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                minValueIndex = i + 1;
            }
        }
        return minValueIndex;
    }

    private static int maxValueIndex(int[] array) {
        int maxValueIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                maxValueIndex = i + 1;
            }
        }
        return maxValueIndex;
    }
}
