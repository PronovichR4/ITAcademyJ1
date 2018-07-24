package classwork.Lesson06;

public class OopDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setName("Windows");
        computer.setHdd(new Hdd(500));
        computer.setRam(new Ram(1024));

        computer.on();
        computer.load();
        computer.off();

        Computer computer2 = new Computer();
        computer2.setName("Mac");
        computer2.setHdd(new Hdd(400));
        computer2.setRam(new Ram(512));

        computer2.on();
        computer2.off();

    }
}
