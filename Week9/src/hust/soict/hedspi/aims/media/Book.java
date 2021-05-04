package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    private String content;
    private List<String> contentTokens = new ArrayList<String>();
    private Map<String, Integer> wordFrequency = new TreeMap<String, Integer>();

    public Book(String strTitle) {
        super(strTitle);
    }

    public Book(String strTitle, String strCategory, float fCost) {
        super(strTitle, strCategory, fCost);
    }

    public Book(String strTitle, String strCategory, float fCost, String strAuthor) {
        super(strTitle, strCategory, fCost);
        this.authors.add(strAuthor);
    }

    public int getType() {
        return 2;
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

        tmp.append(Integer.toString(this.itemID));
        tmp.append(" - ");

        tmp.append("Book - ");

        tmp.append(this.title);
        tmp.append(" - ");

        tmp.append(this.category);
        tmp.append(" - ");

        tmp.append(Float.toString(this.cost));
        tmp.append(" - ");

        if (this.authors.size() == 0) tmp.append("UNKNOW.");
        else
            for (int i = 0; i < this.authors.size(); i++) {
                tmp.append(this.authors.get(i));
                if (i < this.authors.size()-1) tmp.append(" - ");
                else tmp.append(".");
            }
        tmp.append("\n");

        if (this.wordFrequency.size() != 0) {
            for (Map.Entry<String, Integer> entry : this.wordFrequency.entrySet()) {
                String k = entry.getKey();
                Integer v = entry.getValue();
                tmp.append("Word: " + k + " - Frequency: " + v + "\n");
            }
        }

        return tmp.toString();
    }

    public Map<String, Integer> processContent() {
        this.contentTokens = Arrays.asList(content.split(" "));
        Collections.sort(this.contentTokens);                                             //Sap xep cac phan tu trong contentSplit
        int n = contentTokens.size(), k = 1;
        String prev = contentTokens.get(0);
        for (int i = 0; i < n; i++) {
                while (contentTokens.get(i).equals(prev)) {
                    if (i >= n) break;
                    k++;
                    i++;
            };

            this.wordFrequency.put(prev, k);

            k = 1;
            prev = contentTokens.get(i);
        }
        return this.wordFrequency;
    }

    public Map<String, Integer> setContent_processContent(String content) {
        setContent(content);
        return processContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
