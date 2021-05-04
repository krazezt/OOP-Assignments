package hust.soict.hedspi.aims.factories;

import java.util.Scanner;

import hust.soict.hedspi.aims.interfaces.AbstractItemFactory;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.ScannerVariable;

public class CDFactory implements AbstractItemFactory{
    private static Scanner a  = ScannerVariable.scanner;
    public Media createMediaItemFromConsole() {
        System.out.print("CD's title: ");
        String strTitle = a.nextLine();
        System.out.print("CD's category: ");
        String strCategory = a.nextLine();
        System.out.print("CD's cost: ");
        float fCost = a.nextFloat();
        Media cd = new CompactDisc(strTitle, strCategory, fCost);
        System.out.println("Done, this media's ID is: " + cd.getID());
        return cd;
    }
}
