import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First {

    public static int milan;
    public static int madrid;

    public static void main(String[] args) {
        First main = new First();
        main.main();
    }

    public void main()
    {
        int milan = 0;
        int madrid = 0;

        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        JLabel labelResult = new JLabel("Result: 0 X 0");
        JLabel labelScorer = new JLabel("Last Scorer: N/A");
        Label labelWinner = new Label("Winner: DRAW");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                First.milan++;
                labelResult.setText(String.format("%d X %d", First.milan, First.madrid));
                labelScorer.setText("AC Milan");
                if (First.milan > First.madrid)
                {
                    labelWinner.setText("AC Milan");
                }
                else if (First.milan < First.madrid)
                {
                   labelWinner.setText("Real Madrid");
                }
                else
                {
                    labelWinner.setText("DRAW");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                First.madrid++;
                labelResult.setText(String.format("%d X %d", First.milan, First.madrid));
                labelScorer.setText("Real Madrid");
                if (First.milan > First.madrid)
                {
                    labelWinner.setText("AC Milan");
                }
                else if (First.milan < First.madrid)
                {
                    labelWinner.setText("Real Madrid");
                }
                else
                {
                    labelWinner.setText("DRAW");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(labelResult);
        panel.add(labelScorer);
        panel.add(labelWinner);
        panel.add(button2);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}