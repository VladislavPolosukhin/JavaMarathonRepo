package day12.Task4;

import day12.Task5.MusicArtist;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> bandMembers;


    public MusicBand(String name, int year, ArrayList<String> bandMember ) {
        this.name = name;
        this.year = year;
        this.bandMembers = bandMember;
    }

    public int getYear() {
        return year;
    }

    public List<String> getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(List<String> bandMembers) {
        this.bandMembers = bandMembers;
    }

    public void collectMembers (MusicBand anotherMusicBand){
        bandMembers.addAll(anotherMusicBand.getBandMembers());
        anotherMusicBand.getBandMembers().clear();

        /*List<String> listforCopying = new ArrayList<>(anotherMusicBand.getBandMembers());

        for (int i = 0; i <listforCopying.size() ; i++) {
            bandMembers.add(listforCopying.get(i));
            anotherMusicBand.getBandMembers().remove(i);
        }

*/
    }

    @Override
    public String toString() {
        return "Name is " + name + "; year is " + year + "\n Band Members are " + bandMembers.toString();
    }

    public void listOfMembers(){
        for (String s : bandMembers){
            System.out.println(s);
        }
    }
}
