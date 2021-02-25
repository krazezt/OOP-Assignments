import javax.swing.JOptionPane;

public class showResult {
    public void show(int a, Double x1, Double x2) {
        JOptionPane.showMessageDialog(null, "Solution : " + (a==0?"No solution!":(a==1?("x1 = "+x1+", x2 = "+x2):"Countless solutions")));
    }
}
