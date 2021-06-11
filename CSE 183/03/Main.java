import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 200);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        JTextField tf1 = new JTextField(10);
        tf1.setText("0");
        JLabel l1 = new JLabel("USD");
        p1.add(tf1);
        p1.add(l1);
        JTextField tf2 = new JTextField(10);
        tf2.setText("0");

        JButton b = new JButton("Convert");
        p2.add(b);
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tf2.setText(Integer.parseInt(tf1.getText()) * 0.88 + "");
            }
        });


        p3.add(tf2);
        JLabel l2 = new JLabel("Euro");
        p3.add(l2);


        f.setLayout(new FlowLayout());

        f.add(p1);
        f.add(p2);
        f.add(p3);

        f.setVisible(true);

    }
}