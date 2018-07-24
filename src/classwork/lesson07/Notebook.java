package classwork.lesson07;

import classwork.Lesson06.Computer;

public class Notebook extends Computer {
    private String temp;

    public void open()  { System.out.println("Я открылся");}

        @Override
        public void on(){
            open();
            super.on();
        }

    }


