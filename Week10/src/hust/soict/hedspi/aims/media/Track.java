package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.interfaces.Playable;

public class Track implements Playable, Comparable<Object>{
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

    public boolean equals(Object o) {
        if (!(o instanceof Track)) return false;
        else {
            Track t = (Track)o;
            if (this.title.equals(t.getTitle()) && this.length == t.getLength()) return true;
            else return false;
        }
    }

    public int compareTo(Object o) {
        if (!(o instanceof Track)) throw new RuntimeException("Compare error, expected object's type : Track !");
        else {
            Track t = (Track)o;
            if (this.equals(o)) return 0;
            else if (this.length > t.getLength()) return 1;
            else return -1;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public int getLength() {
        return this.length;
    }
}