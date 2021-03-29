package hust.soict.hedspi.lab01.Bai6.Bai6_2;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame {
    private static JFrame mainFrame;
    private static JLabel mes;
    private static JButton subBtn;
    private static JTextField a11_tField, a12_tField, a21_tField, a22_tField, b1_tField, b2_tField;
    private Double a11, a12, a21, a22, b1, b2;
    private void setupGUI() {
        mainFrame = new JFrame("Nhap thong tin");
        mainFrame.setLayout(null);
        mainFrame.setSize(450, 180);
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        
        mes = new JLabel("<html>Nhap thong tin he pt :<br/>x1 +&#9 &#9x2 =<br/>x1 +&#9 &#9x2 =</html>", JLabel.CENTER);
        mes.setFont(mes.getFont().deriveFont(18.0f));

        a11_tField = new JTextField("", 10);
        a12_tField = new JTextField("", 10);
        b1_tField = new JTextField("", 10);
        a21_tField = new JTextField("", 10);
        a22_tField = new JTextField("", 10);
        b2_tField = new JTextField("", 10);

        subBtn = new JButton("OK");

        mes.setBounds(0, 0, 450, 100);
        a11_tField.setBounds(50, 40, 80, 25);
        a12_tField.setBounds(190, 40, 80, 25);
        b1_tField.setBounds(320, 40, 80, 25);

        a21_tField.setBounds(50, 60, 80, 25);
        a22_tField.setBounds(190, 60, 80, 25);
        b2_tField.setBounds(320, 60, 80, 25);

        subBtn.setBounds(195, 95, 60, 30);
        subBtn.addActionListener(new clicked());

        mainFrame.add(mes);
        mainFrame.add(a11_tField);
        mainFrame.add(a12_tField);
        mainFrame.add(a21_tField);
        mainFrame.add(a22_tField);
        mainFrame.add(b1_tField);
        mainFrame.add(b2_tField);
        mainFrame.add(subBtn);
    }

    private class clicked implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
            a11 = Double.parseDouble(a11_tField.getText());
            a12 = Double.parseDouble(a12_tField.getText());
            a21 = Double.parseDouble(a21_tField.getText());
            a22 = Double.parseDouble(a22_tField.getText());
            b1 = Double.parseDouble(b1_tField.getText());
            b2 = Double.parseDouble(b2_tField.getText());
            Calculate clt = new Calculate();
            clt.start(a11, a12, b1, a21, a22, b2);
		}
	}

    private void showWindow() {
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        MainFrame opn = new MainFrame();
        opn.setupGUI();
        opn.showWindow();
    }
}