package classwork.Lesson06;

public class Computer {


    private String name;
    private int hdd;
    private int ram;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Computer(){

    }

    public Computer (String name, int hdd, int ram){
        this.name=name;
        this.hdd=hdd;
        this.ram=ram;

    }
    public void  on (){
        System.out.println("Я включился: " + name+" "+ hdd+" "+ram+" ");
    }

    public void off (){
        System.out.println("Я выключился");


    }

}
