package classwork.Lesson06;

public class Hdd {

    private int hdd;

    public Hdd(int hdd) {
        this.hdd = hdd>0?hdd:0;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }


}
