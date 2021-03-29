package hust.soict.hedspi.aims.order;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.*;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITTED_ORDERS = 5;
    private static int nbOrders = 0;

    private int qtyOrdered;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private MyDate dateOrdered;

    public Order(String strDay, String strMonth, String strYear) {
        if (nbOrders + 1 > MAX_LIMITTED_ORDERS) System.out.println("Out of orders");
        else {
            dateOrdered = new MyDate(strDay, strMonth, strYear);
            this.qtyOrdered = 0;
            ++nbOrders;
        }
    }

    public Order() {
        if (nbOrders + 1 > MAX_LIMITTED_ORDERS) System.out.println("Out of orders");
        else {
            dateOrdered = new MyDate();
            this.qtyOrdered = 0;
            ++nbOrders;
        }
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public boolean addDigitalVideoDisc(DigitalVideoDisc discToAdd) {
        if (this.qtyOrdered + 1 > MAX_NUMBERS_ORDERED) return false;
        else {
            itemsOrdered[++this.qtyOrdered-1] = discToAdd;
            return true;
        }
    }

    public boolean addDigitalVideoDisc(DigitalVideoDisc[] listOfDiscToAdd) {
        if (listOfDiscToAdd.length + this.qtyOrdered > MAX_NUMBERS_ORDERED) return false;
        else {
            int k = this.qtyOrdered;
            this.qtyOrdered += listOfDiscToAdd.length;
            for (int i = k; i < this.qtyOrdered; i++) {
                this.itemsOrdered[i] = listOfDiscToAdd[i - k];
            }
            return true;
        }
    }

    public boolean addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (this.qtyOrdered + 2 > MAX_NUMBERS_ORDERED) return false;
        else {
            this.qtyOrdered += 2;
            this.itemsOrdered[this.qtyOrdered - 2] = dvd1;
            this.itemsOrdered[this.qtyOrdered - 1] = dvd2;
            return true;
        }
    }

    public boolean removeDigitalVideoDisc(DigitalVideoDisc discToRemove) {
        if (this.qtyOrdered == 0) return false;
        else {
            int i = 0;
            while (i < this.qtyOrdered) {
                if (i == this.qtyOrdered) return false;
                if (this.itemsOrdered[i] == discToRemove) {
                    for (int k = i; k < qtyOrdered; k++) {
                        if (k<qtyOrdered) this.itemsOrdered[k] = this.itemsOrdered[k+1];
                        else this.itemsOrdered[k] = null;
                    }
                    --this.qtyOrdered;
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public double totalCost() {                     //Tinh tong so tien trong order, neu khong co don hang nao thi tra ve gia tri -1d, neu co thi tra ve gia tien.
        if (this.qtyOrdered == 0) return -1d;
        double ttlCost = 0d;
        for (int i = 0; i < this.qtyOrdered; i++) {
            ttlCost += this.itemsOrdered[i].getCost();
        }
        return ttlCost;
    }

    public DigitalVideoDisc getLuckyitem() {        //Chon ngau nhien mot item trong Order va giam gia item do ve 0$, neu Order chua co item nao thi tra ve null.
        if (this.qtyOrdered == 0) return null;
        DigitalVideoDisc luckyItem = this.itemsOrdered[(int)(this.qtyOrdered*Math.random())];
        luckyItem.setCost(0f);
        return luckyItem;
    }

    public void printOrderInfo() {
        System.out.println("*****************************Order*****************************");
        System.out.println("Date : ["+this.dateOrdered.getDateTimeString()+"]\nOrdered Items :");
        System.out.printf("  %s | %-40s | %-40s | %-40s | %-6s | %-5s\n", "Type", "Title", "Category", "Director", "Length", "Cost");
        for (int i = 0; i < this.getQtyOrdered(); i++) {
            System.out.printf("%d. DVD - %-40s - %-40s - %-40s - %-6d : %-5f ($)\n", i+1, this.itemsOrdered[i].getTitle(), this.itemsOrdered[i].getCategory(), this.itemsOrdered[i].getDirector(), this.itemsOrdered[i].getLength(), this.itemsOrdered[i].getCost());
        }
        System.out.printf("Total cost : %.2f$\n", this.totalCost());
        System.out.println("***************************************************************");
    }

    public DigitalVideoDisc[] getItemsOrdered() {
        return itemsOrdered;
    }
}
