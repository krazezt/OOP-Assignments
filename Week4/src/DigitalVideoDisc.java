public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
    public DigitalVideoDisc(String strTitle) {
        super();
        this.title = strTitle;
        this.category = "No category";
        this.director = "Unknow";
        this.length = 0;
        this.cost = 0f;
    }

    public DigitalVideoDisc(String strTitle, String strCategory, float fCost) {
        super();
        this.title = strTitle;
        this.category = strCategory;
        this.director = "Unknow";
        this.length = 0;
        this.cost = fCost;
    }

    public DigitalVideoDisc(String strTitle, String strCategory, String strDirector, float fCost) {
        super();
        this.title = strTitle;
        this.category = strCategory;
        this.director = strDirector;
        this.length = 0;
        this.cost = fCost;
    }

    public DigitalVideoDisc(String strTitle, String strCategory, String strDirector, int iLength, float fCost) {
        super();
        this.title = strTitle;
        this.category = strCategory;
        this.director = strDirector;
        this.length = iLength;
        this.cost = fCost;
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
