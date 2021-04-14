package hust.soict.hedspi.aims.media;

public abstract class Disc extends Media {
    protected String director;
    protected int length;

    public Disc(String strTitle) {
        super(strTitle);
    }

    public Disc(String strTitle, String strCategory, float fCost) {
        super(strTitle, strCategory, fCost);
    }

    public Disc(String strTitle, String strCategory, String strDirector, float fCost) {
        super(strTitle, strCategory, fCost);
        this.director = strDirector;
    }

    public Disc(String strTitle, String strCategory, String strDirector, int iLength, float fCost) {
        super(strTitle, strCategory, fCost);
        this.length = iLength;
        this.director = strDirector;
    }
}
