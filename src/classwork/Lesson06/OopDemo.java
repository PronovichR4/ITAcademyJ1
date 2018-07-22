package classwork.Lesson06;

public class OopDemo {
    public static void main(String[] args) {
       Computer computer= new Computer();
        computer.setName("Windows");
        computer.setHdd(500);
        computer.setRam(1024);

        computer.on();
        computer.off();

        Computer computer2= new Computer();
        computer2.setName("Mac");
        computer2.setHdd(400);
        computer2.setRam(512);

        computer2.on();
        computer2.off();

    }
}
