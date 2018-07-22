package classwork.lesson05;

public class Task3 {
    public static void main(String[] args) {
        String s="привет как дела привет";
        String b="приветhjbj";
        System.out.println(check(s,b));

    }
    private static boolean check(String s, String b){
        if (s.startsWith(b)&& s.endsWith(b)){
            return true;
        }
        return false;
    }
}
