package homework.homework12.Task02;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Path pathToFile = Paths.get("resources", "test.txt");
        List<Integer> list = FileUtil.generateIntegers();
        FileUtil.writeListInFile(list, pathToFile);
        Set<Integer> sortedSet = FileUtil.sortIntegersInFile(pathToFile);
        FileUtil.writeListInFile(sortedSet, pathToFile);
    }
}
