package Lec6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Srudent-26 on 16.03.2017.
 */
public class Collecections1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("s1");
        list.add("s2");
        show (list);
        List<String> list2 = new LinkedList<>();
        list2.add("A");
        list2.add("B");
        show(list2);
    }

    private static void show(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
