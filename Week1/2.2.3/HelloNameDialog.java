import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String str;
        str = JOptionPane.showInputDialog("Please enter your name :");
        JOptionPane.showMessageDialog(null, "Hello " + str + ", how are you today!");
        System.exit(0);
    }
}
