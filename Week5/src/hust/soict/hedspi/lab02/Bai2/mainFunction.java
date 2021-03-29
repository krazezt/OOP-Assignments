package hust.soict.hedspi.lab02.Bai2;
import java.util.Scanner;

public class mainFunction {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao cua tam giac muon tao : ");
        int iTrg = a.nextInt();
        Triangle opn = new Triangle();
        opn.setHeight(iTrg);
        opn.display();
        a.close();
    }
}