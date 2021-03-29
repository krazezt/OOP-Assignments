package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
    public static void main(String[] args) {
        Order firstOrder = new Order();
        Order secondOrder = new Order("1st", "jan", "twenty-five thirty");

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Oi dzoi oi", "Nhac hai`", "Tran Duc Quan", 120, 0.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Banner staff of Homa lua` vl", "Tram` cam", "Tran Duc Quan", 60, 1.2f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Hutao di xa qua'", "Tram cam part 2", "Van la Tran Duc Quan :^)", 180, 2f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Con tho con go~", "Nga o dau gap doi o do", "Ngac nhien chua ?", 20, 10f);

        firstOrder.addDigitalVideoDisc(dvd1, dvd2);
        //firstOrder.addDigitalVideoDisc(dvd2);
        firstOrder.addDigitalVideoDisc(dvd3);
        firstOrder.addDigitalVideoDisc(dvd4);
        secondOrder.addDigitalVideoDisc(dvd3, dvd4);
        secondOrder.addDigitalVideoDisc(dvd2, dvd1);

        System.out.println("Total cost : " + firstOrder.totalCost());
        System.out.println("Number ordered : " + firstOrder.getQtyOrdered() + "\n");

        firstOrder.removeDigitalVideoDisc(dvd1);
        System.out.println("Total cost : " + firstOrder.totalCost());
        System.out.println("Number ordered : " + firstOrder.getQtyOrdered());

        firstOrder.printOrderInfo();
        secondOrder.printOrderInfo();

        // Order thirdOrder = new Order();
        // Order fourthOrder = new Order();
        // Order fifthOrder = new Order();
        // Order sixthOrder = new Order();
    }
}