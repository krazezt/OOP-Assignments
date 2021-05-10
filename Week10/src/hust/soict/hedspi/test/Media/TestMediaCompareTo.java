package hust.soict.hedspi.test.Media;

import java.util.ArrayList;
import java.util.List;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;

public class TestMediaCompareTo {
    public static void main(String[] args) {
        Collection<Media> collection = new ArrayList<Media>();
        CompactDisc tmpCD = new CompactDisc("Banner staff of Homa lua` vl", "Kinh di, gay cham` kam", "Michos", 120, 2.99f);
        Media dvd1 = new DigitalVideoDisc("Oi dzoi` dat oi", "Film hai`", "Tran Duc Quan", 160, 2.99f);
        Media dvd2 = new DigitalVideoDisc("Chi' Feo`", "Than` thoai Viet Nam", "Lamb Kout", 1.99f);
        collection.add(dvd2);
        collection.add(new Book("Arda legend", "Vien tuong", 2f, "J.R.R Tonkien"));
        collection.add(dvd1);
        tmpCD.addTrack(new Track("Ngay` thu nhat", 30));
        tmpCD.addTrack(new Track("Ngay` thu hai", 30));
        tmpCD.addTrack(new Track("Ngay` thu bar", 30));
        tmpCD.addTrack(new Track("Ngay` cuoi cung`...huhu", 30));
        collection.add(tmpCD);

        Iterator<Media> iterator = collection.iterator();
        System.out.println("The list before sort :");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }

        Collections.sort((List<Media>)collection);
        iterator = collection.iterator();
        System.out.println();
        System.out.println("The list after sorted :");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
    }
}
