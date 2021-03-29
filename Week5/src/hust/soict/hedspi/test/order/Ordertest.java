package hust.soict.hedspi.test.order;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Ordertest {
    public static void main(String[] args) {
        Order firstOrder = new Order();
        Order secondOrder = new Order("1st", "jan", "twenty-five thirty");

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Oi dzoi oi", "Nhac hai`", "Tran Duc Quan", 120, 0.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Banner staff of Homa lua` vl", "Tram` cam", "Tran Duc Quan", 60, 1.2f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Hutao di xa qua'", "Tram cam part 2", "Van la Tran Duc Quan :^)", 180, 2f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Con tho con go~", "Nga o dau gap doi o do", "Ngac nhien chua ?", 20, 10f);

        firstOrder.addDigitalVideoDisc(dvd1, dvd2);
        firstOrder.addDigitalVideoDisc(dvd3);
        firstOrder.addDigitalVideoDisc(dvd4);
        secondOrder.addDigitalVideoDisc(dvd3, dvd4);
        secondOrder.addDigitalVideoDisc(dvd2, dvd1);

        System.out.println("Total cost before : " + firstOrder.totalCost());
        DigitalVideoDisc luckyItem = firstOrder.getLuckyitem();
        System.out.println("Lucky item is the dics that have title : \"" + luckyItem.getTitle() + "\"");
        System.out.println("Total cost after : " + firstOrder.totalCost());
    }
}
