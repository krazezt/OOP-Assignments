package hust.soict.hedspi.lab02.Bai1;
import java.util.Scanner;

public class jScanner {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("What's your name ?");
        String strName = a.nextLine();
        System.out.println("How old are you ?");
        int iAge = a.nextInt();
        System.out.println("How tall are you (m)?");
        double dHeight = a.nextDouble();

        System.out.print("Mrs/Ms. " + strName + ", " + iAge + " years old. Your height is " + dHeight + "(m).");
        a.close();
    }
}