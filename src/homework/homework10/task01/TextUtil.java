package homework.homework10.task01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class TextUtil {

    private TextUtil() {
    }

    public static Map<String, Integer> uniqueWordsInText(String text) {
        List<String> list = Arrays.asList(text.split(" "));
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }
}
