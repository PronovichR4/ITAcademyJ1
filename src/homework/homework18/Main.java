package homework.homework18;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Path pathToLogFile = Paths.get("src", "homework", "homework18", "log-file.txt");
        Path pathToTimeInterval = Paths.get("src", "homework", "homework18", "TimeInterval.txt");
        Path pathToTotalTime = Paths.get("src", "homework", "homework18", "TotalTime.txt");

        List<TimeActivitys> timeActivitysArray = new ArrayList<>();

        RegexUtill.useRegex(timeActivitysArray, pathToLogFile);
        Reporter.getTimeInterval(timeActivitysArray, pathToTimeInterval);
        Reporter.getTotalTime(timeActivitysArray, pathToTotalTime);
    }
}
