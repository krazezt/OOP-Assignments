package hust.soict.hedspi.aims.factories;

import java.util.Scanner;

import hust.soict.hedspi.aims.interfaces.AbstractItemFactory;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.utils.ScannerVariable;

public class BookFactory implements AbstractItemFactory{
    private static Scanner a  = ScannerVariable.scanner;
    public Media createMediaItemFromConsole() {
        System.out.print("Book's title: ");
        String strTitle = a.nextLine();
        System.out.print("Book's category: ");
        String strCategory = a.nextLine();
        System.out.print("Book's cost: ");
        float fCost = a.nextFloat();
        Media book = new Book(strTitle, strCategory, fCost);
        System.out.println("Done, this media's ID is: " + book.getID());
        return book;
    }
}
