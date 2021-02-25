import javax.swing.JOptionPane;

public class MainProgram {
    public static void main(String[] args) {
        String  a = JOptionPane.showInputDialog(null, "Enter the 1st number (type : double)", "OK", JOptionPane.INFORMATION_MESSAGE),
                b = JOptionPane.showInputDialog(null, "ENter the 2nd number (type : double)", "OK", JOptionPane.INFORMATION_MESSAGE);
        jmath s = new jmath();
        String str =    a + " + " + b + " = " + Double.toString(s.sum(Integer.parseInt(a), Integer.parseInt(b))) + ";\n" +
                        a + " - " + b + " = " + Double.toString(s.difference(Integer.parseInt(a), Integer.parseInt(b))) + ";\n" +
                        a + " * " + b + " = " + Double.toString(s.product(Integer.parseInt(a), Integer.parseInt(b))) + ";\n" +
                        a + " / " + b + " = " + Double.toString(s.quotient(Integer.parseInt(a), Integer.parseInt(b))) + ".";
        JOptionPane.showMessageDialog(null, str);
        System.exit(0);
    }
}