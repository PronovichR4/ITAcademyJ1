package homework.homework12.Task02;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public final class FileUtil {

    private static final int LENGTHOFLIST = 25;
    private static final int RANGEOFRANDOMVALUE = 1000;

    public FileUtil() {
    }

    public static List<Integer> generateIntegers() {
        List<Integer> listOfRandomIntegers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < LENGTHOFLIST; i++) {
            listOfRandomIntegers.add(random.nextInt(RANGEOFRANDOMVALUE));
        }
        return listOfRandomIntegers;
    }

    public static void writeListInFile(Collection<Integer> values, Path path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()))) {
            for (Integer e : values) {
                writer.append(e.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Set<Integer> sortIntegersInFile(Path path) {
        Set<Integer> sortedSetFromFile = new TreeSet<>();
        try (DataInputStream dataInput = new DataInputStream(new FileInputStream(path.toFile()))) {
            String currentValue = null;
            while ((currentValue = dataInput.readLine()) != null) {
                sortedSetFromFile.add(Integer.parseInt(currentValue));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sortedSetFromFile;
    }

}
