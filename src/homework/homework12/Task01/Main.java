package homework.homework12.Task01;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Path readOutFile = Paths.get("resources", "Pushkin2.txt");
        Path writeInFile = Paths.get("resources", "Pushkin3.txt");
        Map<Character, Integer> map = CharUtil.numberOfLetters(readOutFile);
        CharUtil.writeMapInFile(map, writeInFile);
    }
}
