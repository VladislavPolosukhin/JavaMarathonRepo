package day12.Task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> bandMembers;


    public MusicBand(String name, int year, List<MusicArtist> bandMember ) {
        this.name = name;
        this.year = year;
        this.bandMembers = bandMember;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(List<MusicArtist> bandMembers) {
        this.bandMembers = bandMembers;
    }

    public void collectMembers (MusicBand anotherMusicBand){
        bandMembers.addAll(anotherMusicBand.getBandMembers());
        anotherMusicBand.getBandMembers().clear();

    }

    @Override
    public String toString() {
        return "Name is " + name + "; year is " + year + "\n Band Members are " + bandMembers.toString();
    }

    public void listOfMembers(){
        for (MusicArtist musicArtist : bandMembers){
            System.out.println(musicArtist.getName() + " " + musicArtist.getAge());
        }
    }
}
