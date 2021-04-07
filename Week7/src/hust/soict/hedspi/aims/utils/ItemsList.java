package hust.soict.hedspi.aims.utils;

import java.util.List;

import hust.soict.hedspi.aims.media.*;

public class ItemsList {
    public static void showDVD(List<Media> listOfItems) {
        System.out.println("All DVD's information :");
        System.out.println("===================================================================");
        for (int i = 0; i < listOfItems.size(); i++) {
            if (listOfItems.get(i).getType() == 1) {
                System.out.println(listOfItems.get(i).toString());
            }
        }
        System.out.println("===================================================================");
    }

    public static void showBook(List<Media> listOfItems) {
        System.out.println("All Book's information :");
        System.out.println("===================================================================");
        for (int i = 0; i < listOfItems.size(); i++) {
            if (listOfItems.get(i).getType() == 2) {
                System.out.println(listOfItems.get(i).toString());
            }
        }
        System.out.println("===================================================================");
    }

    public static void showCD(List<Media> listOfItems) {
        System.out.println("All CD's information :");
        System.out.println("===================================================================");
        for (int i = 0; i < listOfItems.size(); i++) {
            if (listOfItems.get(i).getType() == 3) {
                System.out.println(listOfItems.get(i).toString());
            }
        }
        System.out.println("===================================================================");
    }
}