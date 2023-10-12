package Third;

import First.CalculationApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class NotepadApp extends JFrame {
    private JMenuBar menuBar;
    private JTextArea text;
    private JButton button1;
    private JButton button2;

    public NotepadApp() {
        super("Calculation app");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.bindComponents();
        this.linkComponents();
    }

    private void linkComponents()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        this.setJMenuBar(this.menuBar);
        panel.add(button1);
        panel.add(button2);
        this.add(panel);
        this.add(text);
    }

    private void bindComponents()
    {
        this.menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Файл");
        fileMenu.add(new JMenuItem("Сохранить"));
        fileMenu.add(new JMenuItem("Выйти"));
        menuBar.add(fileMenu);

        JMenu editMenu = new JMenu("Изменить");
        editMenu.add(new JMenuItem("Копировать"));
        editMenu.add(new JMenuItem("Вырезать"));
        editMenu.add(new JMenuItem("Вставить"));
        menuBar.add(editMenu);

        JMenu aboutMenu = new JMenu("Справка");
        menuBar.add(aboutMenu);

        this.button1 = new JButton("Кнопка 1");
        this.button2 = new JButton("Кнопка 2");
        this.text = new JTextArea();
    }
}
