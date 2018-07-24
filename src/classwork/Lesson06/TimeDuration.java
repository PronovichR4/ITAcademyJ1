package classwork.Lesson06;

public class TimeDuration {

    private static final int MINUTES_IN_HOUR=60;
    private static final int SECONDS_IN_MINUTE=60;
    private static final int SECONDS_IN_HOUR=MINUTES_IN_HOUR*SECONDS_IN_MINUTE;


    private int seconds;
    private int minutes;
    private int hours;

    public TimeDuration(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimeDuration(int fullSeconds) {
        this.hours = fullSeconds / MINUTES_IN_HOUR / SECONDS_IN_MINUTE;
        this.minutes = fullSeconds % SECONDS_IN_MINUTE / MINUTES_IN_HOUR;
        this.seconds = fullSeconds % SECONDS_IN_MINUTE;

    }

    public int fullSeconds() {
        return this.seconds + this.minutes * MINUTES_IN_HOUR + this.hours * SECONDS_IN_HOUR;

    }

    public void print() {
        System.out.println("h= " + this.hours + " m= " + this.minutes + " s= " + this.seconds);
    }
}
