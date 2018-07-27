package homework.homework09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task01v2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        addWordsInList(reader, list);
        markLength4(list);
        printList(list);
    }

    private static void printList(ArrayList<String> list) {
        for (String s : list) {
            System.out.print(s + " ");
        }
    }

    private static ArrayList<String> addWordsInList(BufferedReader reader, ArrayList<String> list) throws IOException {
        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        return list;
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
