package homework.homework09.student;

import java.util.Comparator;

public class FullNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.getFullName().compareTo(secondStudent.getFullName());
    }
}
