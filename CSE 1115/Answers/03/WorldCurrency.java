import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorldCurrency extends JFrame {
    WorldCurrency(String n){
        setTitle(n);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);

        JPanel p = new JPanel();
        JLabel l1 = new JLabel("Euro: ");
        p.add(l1);
        JTextField euro = new JTextField("0.0" , 10);
        p.add(euro);
        JLabel l2 = new JLabel("USD: ");
        p.add(l2);
        JTextField usd = new JTextField("0.0" , 10);
        p.add(usd);
        JButton b = new JButton("Get USD value");
        p.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usd.setText(Double.parseDouble(euro.getText()) * 1.16 + "");
            }
        });
        setContentPane(p);
        setVisible(true);
    }


    public static void main(String[] args){
        new WorldCurrency ("Currency Converter");
    }

}
