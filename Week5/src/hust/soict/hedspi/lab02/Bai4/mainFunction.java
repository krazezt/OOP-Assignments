package hust.soict.hedspi.lab02.Bai4;
import java.util.Scanner;

public class mainFunction {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Nhap so phan tu cho mang : ");
        int n = a.nextInt();
        System.out.print("Nhap cac phan tu cua mang : ");
        int[] iArr = new int[n];
        for (int i = 0; i < n ; i++) {
            iArr[i] = a.nextInt();
        }

        arrayToSort opn = new arrayToSort();
        opn.setValuesOfArray(iArr);
        opn.sort();
        iArr = opn.getValue();

        System.out.print("Mang sau khi da sap xep :");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + iArr[i]);
        }

        a.close();
    }
}