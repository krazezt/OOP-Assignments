import javax.swing.JOptionPane;

public class resolve {
    public void start(double a, double b) {
        JOptionPane.showMessageDialog(null, "Solution : " + (a==0?(b==0?"Countless solution!":"No solution!"):Double.toString((Double)(-b/a))));
    }
}
