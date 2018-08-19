package homework.homework18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Reporter {

    private Reporter() {
    }

    public static void getTimeInterval(List<TimeActivitys> timeActivitysList, Path path) {
        int day = 0;
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path.toFile()))) {
            for (int i = 0; i < timeActivitysList.size() - 1; i++) {
                if (timeActivitysList.get(i).getDay() != day) {
                    day++;
                    bufferedWriter.write("DAY - " + day + "\n");
                }
                if (timeActivitysList.get(i + 1).getDay() == day) {
                    timeActivitysList.get(i).setEndTime(timeActivitysList.get(i + 1).getStartTime());
                    bufferedWriter.write(timeActivitysList.get(i).getStartTime() + "-"
                            + timeActivitysList.get(i + 1).getStartTime() + " " + timeActivitysList.get(i).getActivity() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getTotalTime(List<TimeActivitys> timeActivitysList, Path path) {
        HashMap<String, Long> lecture = new HashMap<>();
        long timeBreak = 0;
        long timeLecture = 0;
        long timeExample = 0;
        long totalTime = 0;
        for (TimeActivitys timeAct : timeActivitysList) {
            if (timeAct.getActivity().toLowerCase().contains("перерыв") || timeAct.getActivity().toLowerCase().contains("обеденный")) {
                timeBreak = timeBreak + timeAct.differenceTime();
                totalTime = totalTime + timeAct.differenceTime();
            } else if (timeAct.getActivity().toLowerCase().contains("упражнени") || timeAct.getActivity().toLowerCase().contains("решения")) {
                timeExample = timeExample + timeAct.differenceTime();
                totalTime = totalTime + timeAct.differenceTime();
            } else if (!timeAct.getActivity().toLowerCase().contains("конец")) {
                timeLecture = timeLecture + timeAct.differenceTime();
                totalTime = totalTime + timeAct.differenceTime();
                if (lecture.containsKey(timeAct.getActivity())) {
                    lecture.put(timeAct.getActivity(), lecture.get(timeAct.getActivity()) + timeAct.differenceTime());
                } else {
                    lecture.put(timeAct.getActivity(), timeAct.differenceTime());
                }
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path.toFile()))) {
            bufferedWriter.write("Общее время всех занятий: " + totalTime + " минут" + "\n");
            bufferedWriter.write("Время перерывов: " + timeBreak + " минут, " + String.format("%.2f", procent(timeBreak, totalTime)) + "%" + "\n");
            bufferedWriter.write("Время лекций: " + timeLecture + " минут, " + String.format("%.2f", procent(timeLecture, totalTime)) + "%" + "\n");
            bufferedWriter.write("Время решений: " + timeExample + " минут, " + String.format("%.2f", procent(timeExample, totalTime)) + "%" + "\n");
            bufferedWriter.write("\n" + "Лекции:" + "\n");
            for (Map.Entry<String, Long> entry : lecture.entrySet()) {
                bufferedWriter.write(entry.getKey() + ", " + entry.getValue() + " минут, " + String.format("%.2f", procent(entry.getValue(), timeLecture)) + "%" + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double procent(long time, long totalTime) {
        return (double) time / ((double) totalTime / 100);
    }
}
