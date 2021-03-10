public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
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
}
