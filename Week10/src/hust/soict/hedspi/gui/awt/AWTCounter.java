package hust.soict.hedspi.gui.awt;

import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame implements ActionListener {
    private Label count_lbl;
    private TextField counter_tf;
    private Button count_btn;
    private int count = 0;

    public AWTCounter () {
        setLayout(new FlowLayout());

        count_lbl = new Label("Counter");
        add(count_lbl);

        counter_tf = new TextField("" + count, 10);
        counter_tf.setEditable(false);
        add(counter_tf);

        count_btn = new Button("Count");
        add(count_btn);

        count_btn.addActionListener(this);

        setTitle("AWT Counter");
        setSize(250, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTCounter();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        ++count;
        counter_tf.setText("" + count);
    }
}
