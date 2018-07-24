package classwork.Lesson06;

public class Computer {


    private String name;
    private Hdd hdd;
    private Ram ram;

    public Computer() {
    }

    public Computer(String name, Hdd hdd, Ram ram) {
        this.name = name;
        this.hdd = hdd;
        this.ram = ram;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }





    public void load() {
        System.out.println("Я загрузился");
    }

    public void on() {
        System.out.println("Я включился: " + name + " " + hdd.getHdd() + " " + ram + " ");
    }

    public void off() {
        System.out.println("Я выключился");


    }

}
