package First;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class CalculationApp extends JFrame {
    enum Operation {
        add,
        sub,
        mul,
        div;
    }
    private JTextField number1JTextField;
    private JTextField number2JTextField;
    private JTextField resultJTextField;
    private JComboBox<Operation> operationJComboBox;
    private JButton performJButton;
    private Operation operation;

    class onOperationChangeActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox<Operation> cbox = (JComboBox<Operation>) e.getSource();
            Operation op = (Operation) cbox.getSelectedItem();
            switch (Objects.requireNonNull(op))
            {
                case add:
                    performJButton.setText("Сложить");
                    operation = Operation.add;
                    break;
                case sub:
                    performJButton.setText("Вычесть");
                    operation = Operation.sub;
                    break;
                case mul:
                    performJButton.setText("Умножить");
                    operation = Operation.mul;
                    break;
                case div:
                    performJButton.setText("Разделить");
                    operation = Operation.div;
                    break;
            }
        }
    };

    class onButtonPerformClickedActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            double num1, num2, res;
            try {
                num1 = Double.parseDouble(number1JTextField.getText());
                num2 = Double.parseDouble(number2JTextField.getText());
            } catch (NumberFormatException exception)
            {
                JOptionPane.showMessageDialog(null, "Невалидные числа");
                return;
            }
            switch (Objects.requireNonNull(operation))
            {
                case add:
                    res = num1 + num2;
                    break;
                case sub:
                    res = num1 - num2;
                    break;
                case mul:
                    res = num1 * num2;
                    break;
                case div:
                    if (num2 == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Делить на 0 нельзя");
                        return;
                    }
                    res = num1 / num2;
                    break;
                default:
                    res = 0;
                    break;
            }
            resultJTextField.setText(String.valueOf(res));
        }
    };

    public CalculationApp() throws HeadlessException {
        super("Calculation app");
        this.number1JTextField = new JTextField(0);
        this.number2JTextField = new JTextField(0);
        this.resultJTextField = new JTextField(0);
        Operation[] operations = new Operation[]{Operation.add, Operation.sub, Operation.mul, Operation.div};
        this.operationJComboBox = new JComboBox<Operation>(operations);
        this.performJButton = new JButton("Добавить");
        performJButton.setHorizontalAlignment(SwingConstants.CENTER);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.operation = Operation.add;
        this.bindComponents();
        this.linkComponents();
    }

    private void linkComponents()
    {
        this.add(this.number1JTextField);
        this.add(this.number2JTextField);
        this.add(this.operationJComboBox);
        this.add(this.performJButton);
        this.add(this.resultJTextField);
    }

    private void bindComponents()
    {
        this.operationJComboBox.addActionListener(new onOperationChangeActionListener());
        this.performJButton.addActionListener(new onButtonPerformClickedActionListener());
    }
}
