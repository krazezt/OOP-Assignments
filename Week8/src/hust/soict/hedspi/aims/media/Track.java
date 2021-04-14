package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.interfaces.Playable;

public class Track implements Playable{
    private String title;
    private int length;

    public void play() {
        System.out.println("Playing track: " + this.getTitle());              //Tại sao không lấy luôn this.title ??
        System.out.println("track length: " + this.getLength());
    }

    public Track(String strTitle, int iLength) {
        this.title = strTitle;
        this.length = iLength;
    }

    public Track(String strTitle) {
        this.title = strTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public int getLength() {
        return this.length;
    }
}