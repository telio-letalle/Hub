package view;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class JavaTabbedView extends JFrame {
    private JTabbedPane tabbedPane;
    private JTextArea mainTextArea;
    private JTextArea modelTextArea;
    private JTextArea viewTextArea;
    private JTextArea controllerTextArea;

    public JavaTabbedView(String mainSnippet, String modelSnippet,
                          String viewSnippet, String controllerSnippet) {
        setTitle("Snippets Java");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        tabbedPane = new JTabbedPane();

        // Main
        mainTextArea = new JTextArea(mainSnippet);
        mainTextArea.setEditable(true);
        JPanel mainPanel = createTabPanel(mainTextArea, "Main.java");
        tabbedPane.addTab("Main", mainPanel);

        // Model
        modelTextArea = new JTextArea(modelSnippet);
        modelTextArea.setEditable(true);
        JPanel modelPanel = createTabPanel(modelTextArea, "Model.java");
        tabbedPane.addTab("Model", modelPanel);

        // View
        viewTextArea = new JTextArea(viewSnippet);
        viewTextArea.setEditable(true);
        JPanel viewPanel = createTabPanel(viewTextArea, "View.java");
        tabbedPane.addTab("View", viewPanel);

        // Controller
        controllerTextArea = new JTextArea(controllerSnippet);
        controllerTextArea.setEditable(true);
        JPanel controllerPanel = createTabPanel(controllerTextArea, "Controller.java");
        tabbedPane.addTab("Controller", controllerPanel);

        add(tabbedPane);
    }

    private JPanel createTabPanel(JTextArea textArea, String defaultFileName) {
        JPanel panel = new JPanel(new BorderLayout());

        // Zone de texte avec scroll
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Panel pour les boutons
        JPanel buttonPanel = new JPanel();

        JButton copyButton = new JButton("Copier");
        copyButton.addActionListener(e -> {
            String text = textArea.getText();
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new java.awt.datatransfer.StringSelection(text), null);
            JOptionPane.showMessageDialog(this, "Copié dans le presse-papier !");
        });

        JButton exportButton = new JButton("Exporter");
        exportButton.addActionListener(e -> {
            exportJavaFile(defaultFileName, textArea.getText());
        });

        buttonPanel.add(copyButton);
        buttonPanel.add(exportButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    private void exportJavaFile(String defaultFileName, String content) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Exporter fichier Java");
        fileChooser.setSelectedFile(new java.io.File(defaultFileName));

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            java.io.File fileToSave = fileChooser.getSelectedFile();

            // Assurer que le fichier a une extension .java
            if (!fileToSave.getName().toLowerCase().endsWith(".java")) {
                fileToSave = new java.io.File(fileToSave.getParent(),
                        fileToSave.getName() + ".java");
            }

            try (FileWriter writer = new FileWriter(fileToSave)) {
                writer.write(content);
                JOptionPane.showMessageDialog(this,
                        "Fichier Java exporté avec succès : " + fileToSave.getAbsolutePath());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                        "Erreur lors de l'export : " + ex.getMessage(),
                        "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}