package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public Book(String strTitle, String strCategory, float fCost, String strAuthor) {
        super(strTitle, strCategory, fCost);
        this.title = strTitle;
        this.category = strCategory;
        this.cost = fCost;
        this.authors.add(strAuthor);
    }

    public boolean addAuthor(String authorName) {
        for (int i = 0; i < this.authors.size(); i++) {
            if (this.authors.get(i).equals(authorName)) return false;
        }
        this.authors.add(authorName);
        return true;
    }

    public boolean removeAuthor(String authorName) {
        for (int i = 0; i < this.authors.size(); i ++) {
            if (this.authors.get(i).equals(authorName)) {
                this.authors.remove(i);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuffer tmp = new StringBuffer();

        tmp.append(this.title);
        tmp.append(" - ");

        tmp.append(this.category);
        tmp.append(" - ");

        tmp.append(Float.toString(this.cost));
        tmp.append(" - ");

        for (int i = 0; i < this.authors.size(); i++) {
            tmp.append(this.authors.get(i));
            if (i < this.authors.size()-1) tmp.append(" - ");
            else tmp.append(".");
        }

        return tmp.toString();
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

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
