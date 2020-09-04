package day12.Task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {


        MusicBand musicBand1 = new MusicBand("Slipknot",1989, new ArrayList<>(Arrays.asList("John","Bob","Garry")));
        MusicBand musicBand2 = new MusicBand("Red ass",1989, new ArrayList<>(Arrays.asList("Stevie","Man","Julia","Don")));


        musicBand1.listOfMembers();
        System.out.println("--------");
        musicBand2.listOfMembers();

        musicBand1.collectMembers(musicBand2);

        System.out.println("--------");
        musicBand1.listOfMembers();
        System.out.println("ххххххх");
        musicBand2.listOfMembers();
    }
}
