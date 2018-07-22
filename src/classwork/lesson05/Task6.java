package classwork.lesson05;

public class Task6 {
    public static void main(String[] args) {
        String s="ghbd.fddfd,dfd,fdfd.!dsd.";
        System.out.println(calc(s));
        System.out.println(calcReg(s));
    }
    private static int calc (String s){
        String result = s.replace(".","");
        result = result.replace(",","");
        result = result.replace("!","");
       return s.length()-result.length();
    }
    private static  int calcReg (String s){
        return s.length()-s.replaceAll("[.,!]","").length();
    }
}
