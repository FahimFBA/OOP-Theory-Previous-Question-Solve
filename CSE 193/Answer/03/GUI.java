import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUI implements WindowListener {
    private Frame f;
    private Button b1, b2, b3, b4, b5, b6;

    public GUI(){
        f = new Frame("Application");
        b1 = new Button("header");
        b2 = new Button("footer");
        b3 = new Button("links");
        b4 = new Button("ads");
        b5 = new Button("contents");
        }

        public void launchFrame(){
        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.WEST);
        f.add(b4, BorderLayout.EAST);
        f.add(b5, BorderLayout.CENTER);
        f.addWindowListener(this);
        f.setSize(250,250);
        f.setBackground(Color.WHITE);
        f.setVisible(true);
        }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e){
        System.exit(0);
        }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.launchFrame();
    }

}
