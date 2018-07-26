package classwork.lesson07;

import classwork.Lesson06.Computer;
import classwork.Lesson06.Hdd;
import classwork.Lesson06.Ram;

public class Notebook extends Computer {
    private String temp;



    public Notebook(String name, Hdd hdd, Ram ram) {
        super(name, hdd, ram);
    }

    public void open()  { System.out.println("Крышка открылась");}

        @Override
        public void on(){
            open();
            super.on();
        }

    }


