import javax.swing.JOptionPane;

public class First_degree_equation {
    public static void main (String[] args) {
        Double  a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of a in \"ax + b = 0\"", "Next", JOptionPane.INFORMATION_MESSAGE)),
                b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of b in \"ax + b = 0\"", "OK", JOptionPane.INFORMATION_MESSAGE));
        resolve st = new resolve();
        st.start(a, b);
    }
}