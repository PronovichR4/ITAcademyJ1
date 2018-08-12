package homework.homework16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Dump {

    private static List<Detail> detailsInDump = new ArrayList<>();
    private static Random random = new Random();

    public static synchronized void addRandomDeatailInDump(int n) {
        for (int i = 0; i < n; i++) {
            detailsInDump.add(Detail.values()[random.nextInt(Detail.values().length)]);
        }
    }

    public static synchronized List<Detail> getDetailForScientist(int n) {
        List<Detail> detailsForScientist = new ArrayList<Detail>();
        if (n <= detailsInDump.size()) {
            for (int i = 0; i < n; i++) {
                int index = random.nextInt(detailsInDump.size());
                detailsForScientist.add(detailsInDump.get(index));
                detailsInDump.remove(index);
            }
        } else {
            int counter = detailsInDump.size();
            for (int i = 0; i < counter; i++) {
                int index = random.nextInt(detailsInDump.size());
                detailsForScientist.add(detailsInDump.get(index));
                detailsInDump.remove(index);
            }
        }
        return detailsForScientist;
    }

    public static void print() {
        System.out.println(Arrays.toString(detailsInDump.toArray()));
    }
}
