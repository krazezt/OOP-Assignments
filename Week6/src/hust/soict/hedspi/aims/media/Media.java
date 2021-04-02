package hust.soict.hedspi.aims.media;

public class Media {
    protected String title;
    protected String category;
    protected float cost;

    public String toString;

    public Media (String strTitle, String strCategory, float fCost) {
        this.title = strTitle;
        this.category = strCategory;
        this.cost = fCost;
    }

    public Media (String strTitle) {
        this.title = strTitle;
        this.category = "UNKNOW";
        this.cost = 0f;
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
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }

    
}
