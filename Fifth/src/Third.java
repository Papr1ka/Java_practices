import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Third {

    public static void main(String[] args) {
        Third third = new Third();
        third.main(args[0]);
    }

    public void main(String path)
    {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);

        ImageIcon image = new ImageIcon(getClass().getResource(path));
        JLabel label = new JLabel(image);
        frame.add(label);
        frame.setVisible(true);
    }
}
