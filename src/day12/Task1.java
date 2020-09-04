package day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add("Car Name" + i);
        }
        for (String s : list) {
            System.out.println(s);
        }


        System.out.println("-------------------------");


        list.add(2, "Added car");
        list.remove(0);

        for (String s : list) {
            System.out.println(s);
        }

    }


}
