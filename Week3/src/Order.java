public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;

    private int qtyOrdered;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public Order() {
        this.qtyOrdered = 0;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public boolean addDigitalVideoDisc(DigitalVideoDisc disctoAdd) {
        if (++this.qtyOrdered >= MAX_NUMBERS_ORDERED) return false;
        else {
            itemsOrdered[this.qtyOrdered-1] = disctoAdd;
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
}
