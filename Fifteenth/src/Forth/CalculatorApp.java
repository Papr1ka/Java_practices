package Forth;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class CalculatorApp extends JFrame {
    private JTextField text;

    public CalculatorApp() {
        super("Calculation app");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.bindComponents();
        this.linkComponents();
    }

    private void linkComponents()
    {
        JPanel pane = new JPanel();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        pane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel panel = new JPanel();
        GridLayout grid = new GridLayout(4, 4);
        grid.setHgap(10);
        grid.setVgap(10);
        panel.setLayout(grid);


        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("/"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("*"));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("-"));
        panel.add(new JButton("0"));
        panel.add(new JButton("."));
        panel.add(new JButton("="));
        panel.add(new JButton("+"));
//        panel.addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                super.componentResized(e);
//                Dimension parent = e.getComponent().getParent().getSize();
//                Dimension compDimension = new Dimension(e.getComponent().getWidth(), (int)(parent.height * 0.6));
//                e.getComponent().setSize(compDimension);
//            }
//        });

        pane.add(text);
        pane.add(Box.createRigidArea(new Dimension(0, 30)));
        pane.add(panel);
        this.getContentPane().add(pane);
    }

    private void bindComponents()
    {
        this.text = new JTextField();
//        text.addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                super.componentResized(e);
//                Dimension parent = e.getComponent().getParent().getSize();
//                Dimension compDimension = new Dimension(e.getComponent().getWidth(), (int)(parent.height * 0.4));
//                e.getComponent().setSize(compDimension);
//            }
//        });
    }
}
