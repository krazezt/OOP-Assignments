package hust.soict.hedspi.lab01.Bai4;
import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String  a = JOptionPane.showInputDialog(null, "Input the 1st number :", "OK", JOptionPane.INFORMATION_MESSAGE),
                b = JOptionPane.showInputDialog(null, "Input the 2nd number :", "OK", JOptionPane.INFORMATION_MESSAGE);
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        String str = a + " and " + b + ", Sum = " + Integer.toString(sum);
        JOptionPane.showMessageDialog(null, str, "Two number and their sum : ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}