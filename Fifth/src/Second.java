import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Second {

    public static void main(String[] args) {
        Second second = new Second();
        second.main();
    }

    static class Figures extends JComponent
    {
        private Figure[] figures;
        public Figures(Figure[] figures) {
            this.figures = figures;
        }

        @Override
        protected void paintComponent(Graphics g)
        {
            Graphics2D g2 = (Graphics2D)g;
            for (Figure figure: this.figures)
            {
                Ellipse2D elipse = new Ellipse2D.Double(figure.getPos1(), figure.getPos2(), figure.getWidth(), figure.getHeight());
                g2.setPaint(figure.getColor());
                g2.draw(elipse);
            }
        }
    }

    public void main()
    {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);

        Random rand = new Random();
        Figure[] figures = new Figure[20];
        for (int i = 0; i < 20; i++) {
            figures[i] = new Figure(
                    new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)),
                    rand.nextDouble() * 500, rand.nextDouble() * 500, 100, 100);
        }
        frame.add(new Figures(figures));
        frame.setVisible(true);
    }
}
