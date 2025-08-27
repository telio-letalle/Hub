package view;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;

public class JavaTabbedView extends JFrame {
    private JTabbedPane tabbedPane;
    private JTextArea mainTextArea, modelTextArea, viewTextArea, controllerTextArea;

    public JavaTabbedView(String mainSnippet, String modelSnippet, String viewSnippet, String controllerSnippet) {
        setTitle("Snippets Java MVC");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        tabbedPane = new JTabbedPane();

        // --- Main ---
        mainTextArea = new JTextArea(mainSnippet);
        mainTextArea.setEditable(true);
        JPanel mainPanel = createTabPanel(mainTextArea);
        tabbedPane.addTab("Main", mainPanel);

        // --- Model ---
        modelTextArea = new JTextArea(modelSnippet);
        modelTextArea.setEditable(true);
        JPanel modelPanel = createTabPanel(modelTextArea);
        tabbedPane.addTab("Model", modelPanel);

        // --- View ---
        viewTextArea = new JTextArea(viewSnippet);
        viewTextArea.setEditable(true);
        JPanel viewPanel = createTabPanel(viewTextArea);
        tabbedPane.addTab("View", viewPanel);

        // --- Controller ---
        controllerTextArea = new JTextArea(controllerSnippet);
        controllerTextArea.setEditable(true);
        JPanel controllerPanel = createTabPanel(controllerTextArea);
        tabbedPane.addTab("Controller", controllerPanel);

        add(tabbedPane);
    }

    // Création d'un panel avec JTextArea + bouton Copier
    private JPanel createTabPanel(JTextArea textArea) {
        JPanel panel = new JPanel(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(textArea);
        JButton copyButton = new JButton("Copier");
        copyButton.addActionListener(e -> {
            String text = textArea.getText();
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection(text), null);
            JOptionPane.showMessageDialog(this, "Copié dans le presse-papier !");
        });

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(copyButton, BorderLayout.SOUTH);
        return panel;
    }
}
