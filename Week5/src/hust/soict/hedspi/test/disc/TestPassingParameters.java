package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameters {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle DVD title : " + jungleDVD.getTitle());
        System.out.println("cinderella DVD title : " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle DVD title : " + jungleDVD.getTitle());
    }

    public static void swap(DigitalVideoDisc obj1, DigitalVideoDisc obj2) {
        String tmp = obj1.getTitle();
        obj1.setTitle(obj2.getTitle());
        obj2.setTitle(tmp);
    }

    public static void changeTitle(DigitalVideoDisc dvd, String newTitle) {
        dvd.setTitle(newTitle);
    }
}
