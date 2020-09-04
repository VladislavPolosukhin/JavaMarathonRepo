package day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new MusicBand("Music Band " + i,(int)(1995 + Math.random() *10)));
        }
        Collections.shuffle(list);

        List<MusicBand> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getYear() > 2000){
                list2.add(list.get(i));
            }
        }

        for (MusicBand musicBand : list){
            System.out.println(musicBand);
        }


        System.out.println("-------------------------");

        for (MusicBand musicBand : list2){
            System.out.println(musicBand);
        }

    }
}
