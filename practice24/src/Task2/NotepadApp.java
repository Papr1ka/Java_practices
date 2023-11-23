package Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

public class NotepadApp extends JFrame {
    private JMenuBar menuBar;
    private JTextArea text;

    private IDocument document;
    private ICreateDocument createDocument;

    public NotepadApp(IDocument document, ICreateDocument createDocument) {
        super("Calculation app");

        this.document = document;
        this.createDocument = createDocument;

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
        this.add(panel);
        this.add(text);
    }

    private void changeTextDocument(IDocument document)
    {
        this.document = document;
        TextDocument txt = (TextDocument)document;
        this.text.setText(txt.data);
    }

    private void bindComponents()
    {
        this.menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");
        JMenuItem i4 = new JMenuItem("Exit");
        fileMenu.add(i1);
        fileMenu.add(i2);
        fileMenu.add(i3);
        fileMenu.add(i4);
        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeTextDocument(createDocument.CreateNew());
            }
        });
        i2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser(".");
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                chooser.showOpenDialog(NotepadApp.this);
                File f = chooser.getSelectedFile();
                try {
                    changeTextDocument(createDocument.CreateOpen(f.getPath()));
                }
                catch (IOException | IllegalArgumentException exception)
                {
                    System.out.println("не удалось прочитать файл");
                }
            }
        });
        i3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Имитационно сохранил");
            }
        });
        i4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NotepadApp.this.dispatchEvent(new WindowEvent(NotepadApp.this, WindowEvent.WINDOW_CLOSING));
            }
        });
        menuBar.add(fileMenu);

        this.text = new JTextArea();
        this.text.setLineWrap(true);
    }
}
