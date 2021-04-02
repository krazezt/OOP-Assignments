package hust.soict.hedspi.aims.media;
import java.util.Arrays;

public class DigitalVideoDisc extends Media{
    private String director;
    private int length;
    
    public DigitalVideoDisc(String strTitle) {
        super(strTitle, "", 0f);
    }

    public DigitalVideoDisc(String strTitle, String strCategory, float fCost) {
        super(strTitle, strCategory, fCost);
    }

    public DigitalVideoDisc(String strTitle, String strCategory, String strDirector, float fCost) {
        super(strTitle, strCategory, fCost);
        this.director = strDirector;
    }

    public DigitalVideoDisc(String strTitle, String strCategory, String strDirector, int iLength, float fCost) {
        super(strTitle, strCategory, fCost);
        this.length = iLength;
        this.director = strDirector;
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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }   
}
