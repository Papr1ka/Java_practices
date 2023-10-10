import javax.swing.*;
import java.awt.*;

public class lab extends JPanel {


    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;
        Stroke stroke = new BasicStroke(2, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND, 0,
                new float[]{3, 1}, 0);
        g2D.setStroke(stroke);


        int x = 70, y = 50;
        for (int i = 0; i < 30; i++) {
            g2D.drawLine(x, y, x + 100, y);

            y++;
        }
        x = 155;
        y = 25;
        for (int i = 0; i < 55; i++) {
            g2D.drawLine(x, y, x + 50, y);

            y++;
        }
        x = 200;
        y = 50;
        for (int i = 0; i < 30; i++) {
            g2D.drawLine(x, y, x + 30, y);

            y++;
        }
        g2D.setPaint(Color.red);
        g2D.fillOval(90, 70, 35, 35);
        g2D.fillOval(175, 70, 35, 35);


    }


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new lab());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(260, 200);
        frame.setVisible(true);
    }
}
