package hust.soict.hedspi.aims.media;

public abstract class Media implements Comparable<Object>{
    protected String title;
    protected String category;
    protected float cost;
    protected int itemID;

    private static int currId = 0;

    public abstract String toString();
    public abstract int getType();

    public Media (String strTitle, String strCategory, float fCost) {
        currId++;
        this.itemID = currId;
        this.title = strTitle;
        this.category = strCategory;
        this.cost = fCost;
    }

    public Media (String strTitle) {
        currId++;
        this.itemID = currId;
        this.title = strTitle;
        this.category = "UNKNOW";
        this.cost = 0f;
    }

    public boolean equals(Object o) {   
        if (!(o instanceof Media)) return false;
        else {
            Media m = (Media)o;
            if (this.getID() == m.getID()) return true;
            else return false;
        }
    }

    public int compareTo(Object o) {
        if (!(o instanceof Media)) throw new RuntimeException("Compare error, expected object's type : Media !");
        else {
            Media m = (Media)o;
            if (this.equals(o)) return 0;
            else if (this.getID() > m.getID()) return 1;
            else return -1;
        }
    }

    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float fCost) {
        this.cost = fCost;
    }
    public int getID() {
        return this.itemID;
    }
}
