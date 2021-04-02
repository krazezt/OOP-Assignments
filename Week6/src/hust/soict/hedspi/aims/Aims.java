package hust.soict.hedspi.aims;

import java.util.Scanner;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
    public static void main(String[] args) {
        int x = 0;
        String tmpString = new String();
        float tmpFloat = 0f;
        int tmpInt = 0;
        Scanner a = new Scanner(System.in);
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
                        System.out.print("Type of the Media: ");
                        a.nextLine();
                        tmpString = a.nextLine();
                        if (tmpString.equals("DVD")) {
                            String [] info = new String[2];
                            System.out.print("DVD's Title: ");
                            tmpString = a.nextLine();
                            info[0] = tmpString;

                            System.out.print("DVD's Category: ");
                            tmpString = a.nextLine();
                            info[1] = tmpString;


                            System.out.print("DVD's Cost: ");
                            tmpFloat = a.nextFloat();
                            
                            Media newMedia = new DigitalVideoDisc(info[0], info[1], tmpFloat);
                            order.addMedia(newMedia);
                        } else if (tmpString.equals("Book")) {
                            String [] info = new String[2];
                            System.out.print("Book's Title: ");
                            tmpString = a.nextLine();
                            info[0] = tmpString;

                            System.out.print("Book's Category: ");
                            tmpString = a.nextLine();
                            info[1] = tmpString;


                            System.out.print("Book's Cost: ");
                            tmpFloat = a.nextFloat();
                            
                            Media newMedia = new Book(info[0], info[1], tmpFloat);
                            order.addMedia(newMedia);
                        }
                        System.out.println("This media's ID is: " + (order.getNumberOfMedia() - 1));
                    }
                    break;

                case 3:
                    if (order == null) System.out.println("No order created !");
                    else {
                        System.out.print("ID of the item to delete: ");
                        tmpInt = a.nextInt();
                        if (order.removeMedia(tmpInt)) System.out.println("Item removed.");
                        else System.out.println("Invalid item's ID !");
                    }
                    break;

                case 4:
                    order.printOrderInfo();
                    break;
                
                case 5:
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

        a.close();
    }

    public static void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("5. Test");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
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