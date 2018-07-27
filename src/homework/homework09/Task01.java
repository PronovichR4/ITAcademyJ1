package homework.homework09;

import java.util.ArrayList;
import java.util.Arrays;

public class Task01 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");

        markLength4(list);

        for (String s : list) {
            System.out.print(s + " ");

        }

    }

    public static ArrayList<String> markLength4(ArrayList<String> newList) {
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i).length() == 4) {
                newList.add(i, "****");
                i++;
            }

        }
        return newList;
    }
}
