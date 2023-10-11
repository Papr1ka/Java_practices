package First;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Run {
    public static void main(String[] args) {
        Run r = new Run();
        r.run();
    }

    public void run()
    {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new GridLayout(4, 5));
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            double width = rand.nextDouble() * 80;
            double height = rand.nextDouble() * 80;
            Color color = new Color(
                    rand.nextInt(255),
                    rand.nextInt(255),
                    rand.nextInt(255)
            );
            if (i % 2 == 0)
            {
                frame.add(new Circle(color, 10, 10, width, height));
            }
            else
            {
                frame.add(new Rectangle(color, 10, 10, width, height));
            }
        }

        frame.setVisible(true);
    }
}
