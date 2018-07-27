package homework.homework09.student;

import java.util.Comparator;

public class AgeComporator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return new Integer(firstStudent.getAge()).compareTo(secondStudent.getAge());
    }
}
