package day12.Task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        day12.Task5.MusicBand musicBand1 = new day12.Task5.MusicBand("Slipknot", 1989, new ArrayList<MusicArtist>(Arrays.asList(new MusicArtist("John", 57), new MusicArtist("Bob", 32), new MusicArtist("Garry", 45))));
        day12.Task5.MusicBand musicBand2 = new day12.Task5.MusicBand("Red ass", 2015, new ArrayList<MusicArtist>(Arrays.asList(new MusicArtist("Julie", 37), new MusicArtist("Mike", 22), new MusicArtist("Oz", 12), new MusicArtist("Cory", 35))));


        musicBand1.listOfMembers();
        System.out.println("--------");
        musicBand2.listOfMembers();

        musicBand1.collectMembers(musicBand2);

        System.out.println("--------");
        musicBand1.listOfMembers();
        System.out.println("xxxxxx");
        musicBand2.listOfMembers();
    }


}
