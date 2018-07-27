package homework.homework09.student;

public class Student {

    private String firstName;
    private String secondName;
    private String fullName;
    private int age;
    private double averageRatingForYear;

    public Student(String firstName, String secondName, int age, double averageRatingForYear) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.averageRatingForYear = averageRatingForYear;
    }

    @Override
    public String toString() {
        return secondName + " " +firstName  + " возраст " + age + " лет " + "средний балл за год " + averageRatingForYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public double getAverageRatingForYear() {
        return averageRatingForYear;
    }

    public String getFullName() {
        return secondName+" "+firstName;
    }
}
