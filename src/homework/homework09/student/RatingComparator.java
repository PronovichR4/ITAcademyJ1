package homework.homework09.student;

import java.util.Comparator;

public class RatingComparator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return new Double(firstStudent.getAverageRatingForYear()).compareTo(secondStudent.getAverageRatingForYear());
    }
}
