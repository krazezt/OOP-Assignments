package hust.soict.hedspi.aims.media;

public abstract class Media{
    protected String title;
    protected String category;
    protected float cost;
    protected int itemID;

    private static int id = 0;

    public abstract String toString();
    public abstract int getType();

    public Media (String strTitle, String strCategory, float fCost) {
        id++;
        this.itemID = id;
        this.title = strTitle;
        this.category = strCategory;
        this.cost = fCost;
    }

    public Media (String strTitle) {
        id++;
        this.itemID = id;
        this.title = strTitle;
        this.category = "UNKNOW";
        this.cost = 0f;
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
