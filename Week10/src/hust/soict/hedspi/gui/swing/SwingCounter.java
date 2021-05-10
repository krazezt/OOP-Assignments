package hust.soict.hedspi.gui.swing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingCounter extends JFrame {
    private JTextField count_tf;
    private JButton count_btn;
    private int count = 0;

    public SwingCounter() {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new JLabel("Counter"));
        count_tf = new JTextField("0", 7);
        count_tf.setEditable(false);
        cp.add(count_tf);

        count_btn = new JButton("Count");
        cp.add(count_btn);

        count_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ++count;
                count_tf.setText("" + count);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Swing Counter");
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new SwingCounter();
            }
        });
    }
}
