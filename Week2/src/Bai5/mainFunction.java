package Bai5;

import java.util.Scanner;

public class mainFunction {
    static int iMatric[][][], size = 0;
    static Scanner a = new Scanner(System.in);
    static matricObj opn = new matricObj();
    public static void main(String[] args) {
        int kt = 0;
        mainFunction.inputMatric();

        while (kt != 3) {
            System.out.println("***Menu***\n1. Nhap lai cac gia tri trong ma tran.\n2. Xem ma tran.\n3. Thoat.");
            kt = a.nextInt();
            switch (kt) {
                case 1 : inputMatric();
                case 2 : opn.display();
            }
        }
        a.close();
    }

    private static void inputMatric() {
        System.out.print("Nhap kich thuoc cua ma tran : ");
        size = a.nextInt();
        iMatric = new int[2][size][size];
        for (int x = 0; x < 2; x++) {
            System.out.printf("Nhap thong tin cho ma tran %d :\n", x+1);
            for (int i = 0; i < size; i++) {
                System.out.print("Nhap "+ size +" so tren hang " + (i+1) + ": ");
                for (int j = 0; j < size; j++) {
                    iMatric[x][i][j] = a.nextInt();
                }
            }
        }
        opn.setValues(size, iMatric[0], iMatric[1]);
    }
}
