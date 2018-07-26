package classwork.lesson07;

import classwork.Lesson06.Computer;
import classwork.Lesson06.Hdd;
import classwork.Lesson06.Ram;

public class Demo {

    public static void main(String[] args) {
        Computer computer = new Computer("PC", new Hdd(1000), new Ram(2048));
        check(computer);
        computer.on();
        System.out.println();
        Notebook notebook = new Notebook("HP", new Hdd(500), new Ram(1024));
        notebook.on();
        check(notebook);


    }

    public static void check(Computer computer) {
        computer.on();
        computer.load();
        computer.off();
    }

}
