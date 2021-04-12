package hust.soict.hedspi.aims.media;
import java.util.Arrays;

import hust.soict.hedspi.aims.interfaces.Playable;

public class DigitalVideoDisc extends Disc implements Playable{

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());              //Tại sao không lấy luôn this.title ??
        System.out.println("DVD length: " + this.getLength());
    }
    
    public DigitalVideoDisc(String strTitle) {
        super(strTitle);
    }

    public DigitalVideoDisc(String strTitle, String strCategory, float fCost) {
        super(strTitle, strCategory, fCost);
    }

    public DigitalVideoDisc(String strTitle, String strCategory, String strDirector, float fCost) {
        super(strTitle, strCategory, strDirector, fCost);
    }

    public DigitalVideoDisc(String strTitle, String strCategory, String strDirector, int iLength, float fCost) {
        super(strTitle, strCategory, strDirector, iLength, fCost);
    }

    public int getType() {
        return 1;
    }

    public boolean search(String titleToken) {
        String [] splittedTitle = this.title.toLowerCase().split(" ");
        String [] splittedTitleToken = titleToken.toLowerCase().split(" ");
        for (int i = 0; i < splittedTitleToken.length; i++) {
            if (!Arrays.asList(splittedTitle).contains(splittedTitleToken[i])) return false;
        }
        return true;
    }

    public String toString() {
        StringBuffer tmp = new StringBuffer();

        tmp.append(Integer.toString(this.itemID));
        tmp.append(" - ");

        tmp.append("DVD - ");

        tmp.append(this.title);
        tmp.append(" - ");

        tmp.append(this.category);
        tmp.append(" - ");

        tmp.append(Float.toString(this.cost));
        tmp.append(" - ");

        tmp.append(this.director);
        tmp.append(" - ");

        tmp.append(Integer.toString(this.length));
        tmp.append(".");

        return tmp.toString();
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }
}
