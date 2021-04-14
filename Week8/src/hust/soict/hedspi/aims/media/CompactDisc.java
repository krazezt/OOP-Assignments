package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.interfaces.Playable;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public void play() {
        for (int i = 0; i < tracks.size(); i++)
            tracks.get(i).play();
    }

    public CompactDisc(String strTitle) {
        super(strTitle);
    }

    public CompactDisc(String strTitle, String strCategory, float fCost) {
        super(strTitle, strCategory, fCost);
    }

    public CompactDisc(String strTitle, String strCategory, String strDirector, float fCost) {
        super(strTitle, strCategory, strDirector, fCost);
    }

    public CompactDisc(String strTitle, String strCategory, String strDirector, int iLength, float fCost) {
        super(strTitle, strCategory, strDirector, iLength, fCost);
    }

    public int getType() {
        return 3;
    }

    public boolean addTrack(Track trackToAdd) {
        for (int i = 0; i < this.tracks.size(); i++)
            if (this.tracks.get(i) == trackToAdd) return false;
        this.tracks.add(trackToAdd);
        return true;
    }

    public boolean removeTrack(Track trackToRemove) {
        return this.tracks.remove(trackToRemove);
    }

    public String getArtist() {
        return this.artist;
    }

    public int getLength() {
        int result = 0;
        for (int i = 0; i < tracks.size(); i++) {
            result += tracks.get(i).getLength();
        }

        return result;
    }
    
    public String toString() {
        StringBuffer tmp = new StringBuffer();

        tmp.append(Integer.toString(this.itemID));
        tmp.append(" - ");

        tmp.append("CD - ");

        tmp.append(this.title);
        tmp.append(" - ");

        tmp.append(this.category);
        tmp.append(" - ");

        tmp.append(Float.toString(this.cost));
        tmp.append(" - ");

        tmp.append(this.director);
        tmp.append(" - ");

        tmp.append(this.artist);
        tmp.append(" - ");

        tmp.append(Integer.toString(this.length));
        tmp.append(".");

        return tmp.toString();
    }
}
