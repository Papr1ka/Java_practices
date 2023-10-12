package Forth;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class CalculatorApp extends JFrame {
    enum Operation {
        add,
        sub,
        mul,
        div;
    }
    enum Num {
        num1,
        num2;
    }
    private JTextField text;
    private StringBuilder number1 = new StringBuilder();
    private StringBuilder number2 = new StringBuilder();
    private Operation operation;
    private Num current = Num.num1;


    public CalculatorApp() {
        super("Calculation app");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.bindComponents();
        this.linkComponents();
    }

    private void handleSymbol(String str)
    {
        System.out.println(str);
        System.out.println(number1.toString());
        System.out.println(number2.toString());
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"))
        {
            boolean o = false;
            if (current == Num.num2 && !number2.isEmpty())
            {
                handleSymbol("=");
                text.setText(number1.toString());
                current = Num.num2;
                o = true;
            }
            if (!o)
            {
                text.setText("");
            }
            CHANGE:
            if (str.equals("+"))
            {
                operation = Operation.add;
            }
            else if (str.equals("-"))
            {
                operation = Operation.sub;
            }
            else if (str.equals("*"))
            {
                operation = Operation.mul;
            }
            else if (str.equals("/"))
            {
                operation = Operation.div;
            }
            current = Num.num2;
        }
        else if (str.equals("="))
        {
            double n1, n2, result;
            try {
                n1 = Double.parseDouble(number1.toString());

            } catch (NumberFormatException exception)
            {
                n1 = 0;
            }
            try
            {
                n2 = Double.parseDouble(number2.toString());
            } catch (NumberFormatException exception)
            {
                JOptionPane.showMessageDialog(null, "Инвалид");
                return;
            }
            switch (operation)
            {
                case add -> {
                    result = n1 + n2;
                }
                case sub -> {
                    result = n1 - n2;
                }
                case mul -> {
                    result = n1 * n2;
                }
                case div -> {
                    if (n2 == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Делить на 0 нельзя");
                        return;
                    }
                    result = n1 / n2;
                }
                default -> {
                    result = 0;
                }
            }
            String r = String.valueOf(result);
            text.setText(r);
            current = Num.num2;
            number1 = new StringBuilder(r);
            number2 = new StringBuilder();
        }
        else {
            switch (current)
            {
                case num1 -> {
                    number1.append(str);
                    text.setText(number1.toString());
                }
                case num2 -> {
                    number2.append(str);
                    text.setText(number2.toString());
                }
            }
        }
    }

    private void linkComponents()
    {
        JPanel pane = new JPanel();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        pane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel panel = new JPanel();
        GridLayout grid = new GridLayout(5, 4);
        grid.setHgap(10);
        grid.setVgap(10);
        panel.setLayout(grid);

        JButton button = new JButton("7");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("7");
            }
        });
        panel.add(button);
        button = new JButton("8");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("8");
            }
        });
        panel.add(button);
        button = new JButton("9");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("9");
            }
        });
        panel.add(button);
        button = new JButton("/");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("/");
            }
        });
        panel.add(button);
        button = new JButton("4");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("4");
            }
        });
        panel.add(button);
        button = new JButton("5");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("5");
            }
        });
        panel.add(button);
        button = new JButton("6");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("6");
            }
        });
        panel.add(button);
        button = new JButton("*");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("*");
            }
        });
        panel.add(button);
        button = new JButton("1");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("1");
            }
        });
        panel.add(button);
        button = new JButton("2");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("2");
            }
        });
        panel.add(button);
        button = new JButton("3");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("3");
            }
        });
        panel.add(button);
        button = new JButton("-");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("-");
            }
        });
        panel.add(button);
        button = new JButton("0");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("0");
            }
        });
        panel.add(button);
        button = new JButton(".");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol(".");
            }
        });
        panel.add(button);
        button = new JButton("=");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("=");
            }
        });
        panel.add(button);
        button = new JButton("+");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSymbol("+");
            }
        });
        panel.add(button);
        button = new JButton("cls");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = new StringBuilder();
                number2 = new StringBuilder();
                current = Num.num1;
                operation = Operation.sub;
                text.setText("");
            }
        });
        panel.add(button);
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
