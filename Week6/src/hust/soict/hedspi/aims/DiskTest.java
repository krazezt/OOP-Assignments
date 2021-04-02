package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {
    public static void main(String[] args) {
         //DigitalVideoDisc dvd1 = new DigitalVideoDisc("Oi dzoi oi", "Nhac hai`", "Tran Duc Quan", 120, 0.99f);
        DigitalVideoDisc dvdtest = new DigitalVideoDisc("Banner staff of Homa lua` dao vler", "Tram` cam", "Tran Duc Quan", 60, 1.2f);

        if (dvdtest.search("staff")) System.out.printf("Tim thay !\n");
        else System.out.println("Khong tim thay !");

        System.out.println("==================================================");
        //========================================

        Order orderTest = new Order("1st", "jan", "twenty-five thirty");

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Oi dzoi oi", "Nhac hai`", "Tran Duc Quan", 120, 0.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Banner staff of Homa lua` vl", "Tram` cam", "Tran Duc Quan", 60, 1.2f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Hutao di xa qua'", "Tram cam part 2", "Van la Tran Duc Quan :^)", 180, 2f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Con tho con go~", "Nga o dau gap doi o do", "Ngac nhien chua ?", 20, 10f);

        orderTest.addMedia(dvd1, dvd2);
        orderTest.addMedia(dvd3);
        orderTest.addMedia(dvd4);

        System.out.println("Total cost before : " + orderTest.totalCost());
        Media luckyItem = orderTest.getLuckyitem();
        System.out.println("Lucky item is the dics that have title : \"" + luckyItem.getTitle() + "\"");
        System.out.println("Total cost after : " + orderTest.totalCost());
    }
}
