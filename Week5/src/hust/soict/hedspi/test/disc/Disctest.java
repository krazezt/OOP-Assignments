package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Disctest {
    public static void main(String[] args) {
        //DigitalVideoDisc dvd1 = new DigitalVideoDisc("Oi dzoi oi", "Nhac hai`", "Tran Duc Quan", 120, 0.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Banner staff of Homa lua` dao vler", "Tram` cam", "Tran Duc Quan", 60, 1.2f);

        if (dvd2.search("staff")) System.out.printf("Tim thay !\n");
        else System.out.println("Khong tim thay !");
    }
}
