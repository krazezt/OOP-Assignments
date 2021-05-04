package hust.soict.hedspi.aims.order;
import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.*;

public class Order {
    public final int MAX_NUMBERS_ORDERED = 10;

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private Media luckyItem;
    private MyDate dateOrdered;

    public Order(String strDay, String strMonth, String strYear) {
        this.dateOrdered = new MyDate(strDay, strMonth, strYear);
    }

    public Order() {
        this.dateOrdered = new MyDate();
    }

    public boolean addMedia(Media mediaToAdd) {
        if (this.itemsOrdered.size() + 1 > MAX_NUMBERS_ORDERED) return false;
        else {
            this.itemsOrdered.add(mediaToAdd);
            return true;
        }
    }

    public boolean addMedia(Media[] listOfMediaToAdd) {
        if (listOfMediaToAdd.length + this.itemsOrdered.size() > MAX_NUMBERS_ORDERED) return false;
        else {
            for (int i = 0; i < listOfMediaToAdd.length; i++) {
                this.itemsOrdered.add(listOfMediaToAdd[i]);
            }
            return true;
        }
    }

    public boolean addMedia(Media media1, Media media2) {
        if (this.itemsOrdered.size() + 2 > MAX_NUMBERS_ORDERED) return false;
        else {
            this.itemsOrdered.add(media1);
            this.itemsOrdered.add(media2);
            return true;
        }
    }

    public boolean removeMedia(Media mediaToRemove) {       //Neu tong so media trong order = 0 thi tra ve false, con lai true
        if (this.itemsOrdered.size() == 0) return false;
        else {
            int i = 0;
            while (i < this.itemsOrdered.size()) {
                if (i == this.itemsOrdered.size()) return false;
                if (this.itemsOrdered.get(i) == mediaToRemove) {
                    this.itemsOrdered.remove(i);
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public boolean removeMedia(int mediaID) {               //Neu tong so media trong order = 0 thi tra ve false, con lai true
        if (this.itemsOrdered.size() - 1 < mediaID) return false;
        else {
            this.itemsOrdered.remove(mediaID);
            return true;
        }
    }

    public double totalCost() {                     //Tinh tong so tien trong order, neu khong co don hang nao thi tra ve gia tri -1d, neu co thi tra ve gia tien.
        if (this.itemsOrdered.size() == 0) return -1d;
        double ttlCost = 0d;
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
            ttlCost += this.itemsOrdered.get(i).getCost();
        }
        ttlCost -= this.luckyItem.getCost();

        return ttlCost;
    }

    public Media getLuckyitem() {                   //Chon ngau nhien mot item trong Order va giam gia item do ve 0$, neu Order chua co item nao thi tra ve null.
        if (this.itemsOrdered.size() == 0) return null;
        this.luckyItem = this.itemsOrdered.get((int)(this.itemsOrdered.size()*Math.random()));
        return this.luckyItem;
    }

    public void printOrderInfo() {
        System.out.println("==========================================================");
        System.out.println("[" + this.dateOrdered.getDateTimeString() + "]");
        System.out.println("------------------------");
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
            System.out.println(this.itemsOrdered.get(i).toString());
        }
        System.out.println("==========================================================");
    }

    public int getNumberOfMedia() {
        return this.itemsOrdered.size();
    }
}
