package hust.soict.hedspi.aims.factories;

import java.util.Scanner;

import hust.soict.hedspi.aims.interfaces.AbstractItemFactory;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.ScannerVariable;

public class DVDFactory implements AbstractItemFactory{
    private static Scanner a  = ScannerVariable.scanner;
    public Media createMediaItemFromConsole() {
        System.out.print("DVD's title: ");
        String strTitle = a.nextLine();
        System.out.print("DVD's category: ");
        String strCategory = a.nextLine();
        System.out.print("DVD's cost: ");
        float fCost = a.nextFloat();
        Media dvd = new DigitalVideoDisc(strTitle, strCategory, fCost);
        System.out.println("done, this media's ID is: " + dvd.getID());
        return dvd;
    }
}