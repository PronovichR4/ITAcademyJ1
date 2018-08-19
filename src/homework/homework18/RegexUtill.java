package homework.homework18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RegexUtill {

    private RegexUtill() {
    }

    public static void useRegex(List<TimeActivitys> timeActivitysList, Path path) {
        int day = 1;
        Pattern patern = Pattern.compile("(\\d{2}:\\d{2})\\s?([а-яА-Я\\s]+)");
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(path.toFile())))) {
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                if (s.equals("")) {
                    day++;
                    continue;
                } else {
                    Matcher matcher = patern.matcher(s);
                    matcher.find();
                    timeActivitysList.add(new TimeActivitys(day, LocalTime.parse(matcher.group(1)), matcher.group(2)));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
