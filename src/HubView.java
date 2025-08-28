package view;

import javax.swing.*;
import java.awt.*;

public class HubView extends JFrame {
    private JButton htmlButton;
    private JButton cssButton;
    private JButton javaButton;

    private JTabbedPane tabbedPane;

    // JTextAreas pour chaque onglet
    private JTextArea htmlTextArea;
    private JTextArea cssTextArea;
    private JTextArea javaTextArea;

    // Boutons copier
    private JButton htmlCopyButton;
    private JButton cssCopyButton;
    private JButton javaCopyButton;

    // Boutons export
    private JButton htmlExportButton;
    private JButton cssExportButton;

    public HubView() {
        setTitle("Hub de Snippets");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // ---- Barre de boutons en haut ----
        JPanel topPanel = new JPanel();
        htmlButton = new JButton("HTML (base)");
        cssButton = new JButton("CSS (base)");
        javaButton = new JButton("Java (MMVC)");
        topPanel.add(htmlButton);
        topPanel.add(cssButton);
        topPanel.add(javaButton);

        // ---- Onglets ----
        tabbedPane = new JTabbedPane();

        // HTML
        htmlTextArea = new JTextArea();
        htmlTextArea.setEditable(true);
        htmlCopyButton = new JButton("Copier");
        htmlExportButton = new JButton("Exporter");
        JPanel htmlButtonPanel = new JPanel();
        htmlButtonPanel.add(htmlCopyButton);
        htmlButtonPanel.add(htmlExportButton);
        JPanel htmlPanel = new JPanel(new BorderLayout());
        htmlPanel.add(new JScrollPane(htmlTextArea), BorderLayout.CENTER);
        htmlPanel.add(htmlButtonPanel, BorderLayout.SOUTH);

        // CSS
        cssTextArea = new JTextArea();
        cssTextArea.setEditable(true);
        cssCopyButton = new JButton("Copier");
        cssExportButton = new JButton("Exporter");
        JPanel cssButtonPanel = new JPanel();
        cssButtonPanel.add(cssCopyButton);
        cssButtonPanel.add(cssExportButton);
        JPanel cssPanel = new JPanel(new BorderLayout());
        cssPanel.add(new JScrollPane(cssTextArea), BorderLayout.CENTER);
        cssPanel.add(cssButtonPanel, BorderLayout.SOUTH);

        // Java
        javaTextArea = new JTextArea();
        javaTextArea.setEditable(true);
        javaCopyButton = new JButton("Copier");
        JPanel javaPanel = new JPanel(new BorderLayout());
        javaPanel.add(new JScrollPane(javaTextArea), BorderLayout.CENTER);
        javaPanel.add(javaCopyButton, BorderLayout.SOUTH);

        tabbedPane.addTab("HTML (base)", htmlPanel);
        tabbedPane.addTab("CSS (base)", cssPanel);
        tabbedPane.addTab("Java (MMVC)", javaPanel);

        // ---- Layout ----
        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(tabbedPane, BorderLayout.CENTER);
    }

    // Getters pour les boutons
    public JButton getHtmlButton() { return htmlButton; }
    public JButton getCssButton() { return cssButton; }
    public JButton getJavaButton() { return javaButton; }

    public JTextArea getHtmlTextArea() { return htmlTextArea; }
    public JTextArea getCssTextArea() { return cssTextArea; }
    public JTextArea getJavaTextArea() { return javaTextArea; }

    public JButton getHtmlCopyButton() { return htmlCopyButton; }
    public JButton getCssCopyButton() { return cssCopyButton; }
    public JButton getJavaCopyButton() { return javaCopyButton; }

    public JButton getHtmlExportButton() { return htmlExportButton; }
    public JButton getCssExportButton() { return cssExportButton; }

    public JTabbedPane getTabbedPane() { return tabbedPane; }
}