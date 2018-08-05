package homework.homework10.task01;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String text = "Please input your text";
        Map<String, Integer> map = new HashMap<>();
        map = TextUtil.uniqueWordsInText(text);

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
