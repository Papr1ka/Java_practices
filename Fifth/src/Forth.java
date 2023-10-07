import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Forth {
    static int i;

    public Forth() {
        Forth.i = 0;
    }

    public static void main(String[] args) {
        Forth third = new Forth();
        third.main();
    }

    public void main()
    {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);

        ImageIcon image1 = new ImageIcon(getClass().getResource("./1.png"));
        ImageIcon image2 = new ImageIcon(getClass().getResource("./2.png"));
        ImageIcon image3 = new ImageIcon(getClass().getResource("./3.png"));
        ImageIcon image4 = new ImageIcon(getClass().getResource("./4.png"));
        ImageIcon image5 = new ImageIcon(getClass().getResource("./5.png"));
        ImageIcon image6 = new ImageIcon(getClass().getResource("./6.png"));
        JLabel label = new JLabel(image1);
        frame.add(label);
        frame.setVisible(true);
        Timer t = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int c = Forth.i % 6;
                switch (c)
                {
                    case 0:
                        label.setIcon(image1);
                        break;
                    case 1:
                        label.setIcon(image2);
                        break;
                    case 2:
                        label.setIcon(image3);
                        break;
                    case 3:
                        label.setIcon(image4);
                        break;
                    case 4:
                        label.setIcon(image5);
                        break;
                    case 5:
                        label.setIcon(image6);
                        break;
                }
                Forth.i++;
            }
        });
        t.start();
    }
}
