package view;

import javax.swing.*;
import java.awt.*;

public class HubView extends JFrame {
    private JButton htmlButton;
    private JButton cssButton;
    private JButton javaButton;

    private JTabbedPane tabbedPane;

    public HubView() {
        setTitle("Hub de Snippets");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // ---- Barre de boutons en haut ----
        JPanel topPanel = new JPanel();
        htmlButton = new JButton("HTML");
        cssButton = new JButton("CSS");
        javaButton = new JButton("Java");

        topPanel.add(htmlButton);
        topPanel.add(cssButton);
        topPanel.add(javaButton);

        // ---- Onglets ----
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("HTML", new JScrollPane(new JTextArea("Snippet HTML ici...")));
        tabbedPane.addTab("CSS", new JScrollPane(new JTextArea("Snippet CSS ici...")));
        tabbedPane.addTab("Java", new JScrollPane(new JTextArea("Snippet Java ici...")));

        // ---- Layout ----
        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(tabbedPane, BorderLayout.CENTER);
    }

    // Getters
    public JButton getHtmlButton() { return htmlButton; }
    public JButton getCssButton() { return cssButton; }
    public JButton getJavaButton() { return javaButton; }

    public JTabbedPane getTabbedPane() { return tabbedPane; }
}
