package classwork.Lesson06;

public class Atm {

    private int count20;
    private int count50;
    private int count100;

    public Atm() {
    }

    public Atm(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public void print(){
        System.out.printf("20: %d, 50: %d, 100: %d", count20,count50, count100);

    }
}
