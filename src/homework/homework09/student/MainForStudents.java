package homework.homework09.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainForStudents {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Игорь", "Пронович", 27, 9));
        students.add(new Student("Павел", "Долбик", 26, 9.5));
        students.add(new Student("Илья", "Новиков", 26, 5));
        students.add(new Student("Вадим", "Бахар", 27, 8));
        students.add(new Student("Леха", "Городецкий", 27, 6));
        students.add(new Student("Виктор", "Халимончик", 26, 9.6));
        students.add(new Student("Саша", "Клишевич", 27, 7));

        studentWithMaxRating(students);

        sortByFullName(students);

        sortByAge(students);

        sortByRating(students);

    }

    public static void studentWithMaxRating(ArrayList<Student> student) {

        Iterator<Student> iterator = student.iterator();
        Student studentWithMaxRating = student.get(0);
        while (iterator.hasNext()) {
            Student tempStudentRating = iterator.next();
            if (tempStudentRating.getAverageRatingForYear() > studentWithMaxRating.getAverageRatingForYear()) {
                studentWithMaxRating = tempStudentRating;
            }
        }
        System.out.println("Максимальный средний бал: " + studentWithMaxRating.toString());
    }

    public static void sortByFullName(ArrayList<Student> student) {
        Collections.sort(student, new FullNameComparator());
        for (Student std : student) {
            System.out.println(std.toString());
        }
    }

    public static void sortByAge(ArrayList<Student> student) {
        Collections.sort(student, new AgeComporator());
        for (Student std : student) {
            System.out.println(std.toString());
        }
    }

    public static void sortByRating(ArrayList<Student> student) {
        Collections.sort(student, new RatingComparator());
        for (Student std : student) {
            System.out.println(std.toString());
        }
    }
}
