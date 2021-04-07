package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.utils.ItemsList;

public class Aims {
    private static List<Media> listOfItems= new ArrayList<Media>();
    private static Scanner a = new Scanner(System.in);
    public static void main(String[] args) {
        int x = 0;

        chooseMode();
        x = a.nextInt();

        do {
            switch (x){
                case 1:
                    adminApp();
                    break;
                case 2:
                    userApp();
                    break;
                default:
                    if (x != 0)
                        System.out.println("Error !");
                    break;

            }

            if (x != 0) {
                chooseMode();
                x = a.nextInt();
            }
        } while (x != 0);
        a.close();
    }

    private static void userApp() {
        int tmpInt = 0;
        int x = 0;
        Order order = null;

        showMenu();
        x = a.nextInt();

        do {
            switch (x) {
                case 1:
                    order = new Order();
                    System.out.println("New order created");
                    break;
                
                case 2:
                    if (order == null) System.out.println("No order created !");
                    else {
                        showItemTypeList();
                        int k = a.nextInt();
                        switch (k) {
                            case 1:
                                ItemsList.showDVD(listOfItems);
                                System.out.println("Enter the ID of the DVD that you want to add into current order.");
                                tmpInt = a.nextInt();
                                
                                if (addItemIntoOrder(order, tmpInt)) System.out.println("Item added into current order.");
                                else System.out.println("Non-exist ID or invalid ID !");
                                break;

                            case 2:
                                ItemsList.showBook(listOfItems);
                                System.out.println("Enter the ID of the book that you want to add into current order.");
                                tmpInt = a.nextInt();
                                
                                if (addItemIntoOrder(order, tmpInt)) System.out.println("Item added into current order.");
                                else System.out.println("Non-exist ID or invalid ID !");
                                break;
                            
                            case 3:
                                ItemsList.showCD(listOfItems);
                                System.out.println("Enter the ID of the CD that you want to add into current order.");
                                tmpInt = a.nextInt();
                                
                                if (addItemIntoOrder(order, tmpInt)) System.out.println("Item added into current order.");
                                else System.out.println("Non-exist ID or invalid ID !");
                                break;
                            default:
                                break;
                        }
                    }
                    break;

                case 3:
                    if (order == null) System.out.println("No order created !");
                    else {
                        System.out.println("All information of items in the current order :");
                        order.printOrderInfo();
                        System.out.print("ID of the item to delete: ");
                        tmpInt = a.nextInt();
                        if (removeItemFromOrder(order, tmpInt)) System.out.println("=> Removed.");
                        else System.out.println("Invalid item's ID !");
                    }
                    break;

                case 4:
                    order.printOrderInfo();
                    break;

                case 5:
                    System.out.println("List of items :");
                    System.out.println("==========================================================");
                    for (int i = 0; i < listOfItems.size(); i++) {
                        System.out.println(listOfItems.get(i).toString());
                    }
                    System.out.println("==========================================================");
                    break;

                case 6:
                    test();
                    break;

                default:
                    if (x != 0)
                    System.out.println("Error !");
                    break;
            }

            if (x!= 0) {
                showMenu();
                x = a.nextInt();
            }
        } while (x != 0);
    }

    public static void chooseMode() {
        System.out.println("Modes:");
        System.out.println("--------------------------------");
        System.out.println("1. Admin Application");
        System.out.println("2. User Application");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    private static void adminApp() {
        String tmpString = new String();
        float tmpFloat = 0f;
        int tmpInt = 0;
        int x = 0;
        String [] info = new String[2];
        Media tmpMedia;

        showAdminMenu();
        x = a.nextInt();

        do {
            switch (x) {
                case 1:
                    int k = 0;
                    showItemTypeList();
                    k = a.nextInt();
                    a.nextLine();
                    switch (k) {
                        case 1 :
                            info = new String[2];
                            System.out.print("DVD's Title: ");
                            tmpString = a.nextLine();
                            info[0] = tmpString;

                            System.out.print("DVD's Category: ");
                            tmpString = a.nextLine();
                            info[1] = tmpString;

                            System.out.print("DVD's Cost: ");
                            tmpFloat = a.nextFloat();
                            
                            tmpMedia = new DigitalVideoDisc(info[0], info[1], tmpFloat);
                            listOfItems.add(tmpMedia);
                            System.out.println("This media's ID is: " + tmpMedia.getID());
                            break;
                        case 2 :
                            info = new String[2];
                            System.out.print("Book's Title: ");
                            tmpString = a.nextLine();
                            info[0] = tmpString;

                            System.out.print("Book's Category: ");
                            tmpString = a.nextLine();
                            info[1] = tmpString;

                            System.out.print("Book's Cost: ");
                            tmpFloat = a.nextFloat();
                            
                            tmpMedia = new Book(info[0], info[1], tmpFloat);
                            listOfItems.add(tmpMedia);
                            System.out.println("This media's ID is: " + tmpMedia.getID());
                            break;
                        case 3 :
                            info = new String[2];
                            System.out.print("CD's Title: ");
                            tmpString = a.nextLine();
                            info[0] = tmpString;

                            System.out.print("CD's Category: ");
                            tmpString = a.nextLine();
                            info[1] = tmpString;

                            System.out.print("CD's Cost: ");
                            tmpFloat = a.nextFloat();

                            tmpMedia = new CompactDisc(info[0], info[1], tmpFloat);
                            listOfItems.add(tmpMedia);
                            System.out.println("This media's ID is: " + tmpMedia.getID());
                            break;
                    }
                    break;

                case 2:
                    System.out.print("ID of the item to delete : ");
                    tmpInt = a.nextInt();
                    if (removeItem(tmpInt)) System.out.println(("=> Removed"));
                    else System.out.println("Non-exist ID or invalid ID !");
                    break;

                case 3:
                    System.out.println("List of items :");
                    System.out.println("==========================================================");
                    for (int i = 0; i < listOfItems.size(); i++) {
                        System.out.println(listOfItems.get(i).toString());
                    }
                    System.out.println("==========================================================");
                    break;
            }

            if (x!= 0) {
                showAdminMenu();
                x = a.nextInt();
            }
        } while (x != 0);
    }

    public static boolean removeItem(int id) {
        for (int i = 0; i < listOfItems.size(); i++) {
            if (listOfItems.get(i).getID() == id) {
                Media tmpMediaRemoved = listOfItems.remove(i);
                System.out.println("Item's infomation :");
                System.out.println(tmpMediaRemoved.toString());
                return true;
            }
        }
        return false;
    }

    public static boolean addItemIntoOrder(Order order, int itemID) {
        for (int i = 0; i < listOfItems.size(); i++)
            if (listOfItems.get(i).getID() == itemID) {
                order.addMedia(listOfItems.get(i));
                return true;
            }
        return false;
    }

    public static boolean removeItemFromOrder(Order order, int itemID) {
        for (int i = 0; i < listOfItems.size(); i++) {
            if(listOfItems.get(i).getID() == itemID) {
                System.out.println("Item's information :");
                System.out.println(listOfItems.get(i).toString());
                order.removeMedia(listOfItems.get(i));
                return true;
            }
        }
        return false;
    }

    public static void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item in order");
        System.out.println("4. Display the items list of order");
        System.out.println("5. Show the information of all items in store.");
        System.out.println("6. Test");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5-6");
    }

    public static void showAdminMenu() {
        System.out.println("Product Management Application:");
        System.out.println("--------------------------------");
        System.out.println("1. Create new item");
        System.out.println("2. Delete item by id");
        System.out.println("3. Display the items list");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void showItemTypeList () {
        System.out.println("Type of the item:");
        System.out.println("--------------------------------");
        System.out.println("1. DVD");
        System.out.println("2. Book");
        System.out.println("3. CD");
        System.out.println("0. Wrong key pressed, sorry. Let me out !");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    private static void test() {
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