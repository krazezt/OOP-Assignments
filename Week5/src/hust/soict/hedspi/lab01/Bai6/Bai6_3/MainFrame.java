package hust.soict.hedspi.lab01.Bai6.Bai6_3;
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
    private static JLabel mes, pt;
    private static JButton subBtn;
    private static JTextField aText, bText, cText;
    private Double a, b, c;
    private void setupGUI() {
        mainFrame = new JFrame("Nhap thong tin");
        mainFrame.setLayout(null);
        mainFrame.setSize(450, 180);
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        
        mes = new JLabel("Nhap thong tin pt :", JLabel.CENTER);
        mes.setFont(mes.getFont().deriveFont(18.0f));
        pt = new JLabel(".x^2 +                 .x +                    = 0", JLabel.CENTER);
        pt.setFont(mes.getFont());

        aText = new JTextField("", 10);
        bText = new JTextField("", 10);
        cText = new JTextField("", 10);

        subBtn = new JButton("OK");

        mes.setBounds(0, 0, 450, 40);
        pt.setBounds(52, 33, 450, 40);
        aText.setBounds(50, 40, 80, 25);
        bText.setBounds(190, 40, 80, 25);
        cText.setBounds(320, 40, 80, 25);

        subBtn.setBounds(195, 75, 60, 30);
        subBtn.addActionListener(new clicked());

        mainFrame.add(mes);
        mainFrame.add(pt);
        mainFrame.add(aText);
        mainFrame.add(bText);
        mainFrame.add(cText);
        mainFrame.add(subBtn);
    }

    private class clicked implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
            a = Double.parseDouble(aText.getText());
            b = Double.parseDouble(bText.getText());
            c = Double.parseDouble(cText.getText());
            Calculate clt = new Calculate();
            clt.cal(a, b, c);
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