package Second;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ComboBoxApp extends JFrame {
    enum Country {
        rus("Россия"),
        us("Штаты");
        private final String name;
        Country(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return this.name;
        }
    }
    private JComboBox<Country> operationJComboBox;

    class onCountrySelectedActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox<Country> cbox = (JComboBox<Country>) e.getSource();
            Country op = (Country) cbox.getSelectedItem();
            switch (Objects.requireNonNull(op))
            {
                case rus:
                    JOptionPane.showMessageDialog(null, "Россия, прекрасная страна, выгляни в окно!");
                    break;
                case us:
                    JOptionPane.showMessageDialog(null, "Соединённые штаты Америки, что тут скажешь...");
                    break;
            }
        }
    };

    public ComboBoxApp() throws HeadlessException {
        super("ComboBox app");
        Country[] countries = Country.values();
        this.operationJComboBox = new JComboBox<Country>(countries);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.bindComponents();
        this.linkComponents();
    }

    private void linkComponents()
    {
        this.add(this.operationJComboBox);
    }

    private void bindComponents()
    {
        this.operationJComboBox.addActionListener(new onCountrySelectedActionListener());
    }
}
