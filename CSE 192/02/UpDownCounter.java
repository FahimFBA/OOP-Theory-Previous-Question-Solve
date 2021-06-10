import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpDownCounter extends JFrame {
    private JTextField both;
    private JButton upCounter, downCounter, reset;
    private Container c;

    public UpDownCounter() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Counter");
        setBounds(0, 0, 500, 250);
        c = getContentPane();
        c.setLayout(null);
        both = new JTextField("0");
        both.setBounds(200, 5, 100, 50);
        c.add(both);
        upCounter = new JButton("UP");
        upCounter.setBounds(90, 60, 100, 50);
        c.add(upCounter);
        upCounter.addActionListener(new actionHandler());
        downCounter = new JButton("Down");
        downCounter.setBounds(200, 60, 100, 50);
        c.add(downCounter);
        downCounter.addActionListener(new actionHandler());
        reset = new JButton("Reset");
        reset.setBounds(310, 60, 100, 50);
        c.add(reset);
        reset.addActionListener(new actionHandler());

    }


    class actionHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            if (e.getSource()==upCounter){
                both.setText(Integer.parseInt(both.getText()) + 3 + "");
            }

            if (e.getSource()==downCounter){
                both.setText(Integer.parseInt(both.getText()) + (-3) + "");
            }
            if (e.getSource()==reset){
                both.setText("0");
            }
        }
    }

    public static void main(String[] args) {

        new UpDownCounter();

    }
}