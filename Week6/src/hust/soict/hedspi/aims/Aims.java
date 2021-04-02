package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
    public static void main(String[] args) {
        Order firstOrder = new Order();
        Order secondOrder = new Order("1st", "jan", "twenty-five thirty");

        Media dvd1 = new DigitalVideoDisc("Oi dzoi oi", "Nhac hai`", "Tran Duc Quan", 120, 0.99f);
        Media dvd2 = new DigitalVideoDisc("Banner staff of Homa lua` vl", "Tram` cam", "Tran Duc Quan", 60, 1.2f);
        Media dvd3 = new DigitalVideoDisc("Hutao di xa qua'", "Tram cam part 2", "Van la Tran Duc Quan :^)", 180, 2f);
        Media dvd4 = new DigitalVideoDisc("Con tho con go~", "Nga o dau gap doi o do", "Ngac nhien chua ?", 20, 10f);
        Media book1 = new Book("Yada", "Fantasy", 10f, "J.R.R Tonkien");

        firstOrder.addMedia(dvd1, dvd2);
        firstOrder.addMedia(dvd3);
        firstOrder.addMedia(dvd4);
        firstOrder.addMedia(book1);
        secondOrder.addMedia(dvd3, dvd4);
        secondOrder.addMedia(dvd2, dvd1);

        System.out.println("Total cost : " + firstOrder.totalCost());
        System.out.println("Number ordered : " + firstOrder.getNumberOfMedia() + "\n");

        firstOrder.removeMedia(dvd1);
        System.out.println("Total cost : " + firstOrder.totalCost());
        System.out.println("Number ordered : " + firstOrder.getNumberOfMedia());

        firstOrder.printOrderInfo();
        secondOrder.printOrderInfo();
    }
}