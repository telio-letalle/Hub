package controller;

import model.HubModel;
import view.HubView;
import view.JavaTabbedView;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class HubController {
    private HubView view;
    private HubModel model;

    public HubController(HubView view, HubModel model) {
        this.view = view;
        this.model = model;

        // HTML
        this.view.getHtmlButton().addActionListener(e -> {
            this.view.getHtmlTextArea().setText(model.getHtmlSnippet());
            this.view.getTabbedPane().setSelectedIndex(0);
        });

        this.view.getHtmlCopyButton().addActionListener(e -> {
            String text = view.getHtmlTextArea().getText();
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new java.awt.datatransfer.StringSelection(text), null);
            JOptionPane.showMessageDialog(view, "Copié dans le presse-papier !");
        });

        this.view.getHtmlExportButton().addActionListener(e -> {
            exportToFile("HTML", ".html", view.getHtmlTextArea().getText());
        });

        // CSS
        this.view.getCssButton().addActionListener(e -> {
            this.view.getCssTextArea().setText(model.getCssSnippet());
            this.view.getTabbedPane().setSelectedIndex(1);
        });

        this.view.getCssCopyButton().addActionListener(e -> {
            String text = view.getCssTextArea().getText();
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new java.awt.datatransfer.StringSelection(text), null);
            JOptionPane.showMessageDialog(view, "Copié dans le presse-papier !");
        });

        this.view.getCssExportButton().addActionListener(e -> {
            exportToFile("CSS", ".css", view.getCssTextArea().getText());
        });

        // Java Button - ouvre une nouvelle fenêtre avec onglets Java
        this.view.getJavaButton().addActionListener(e -> {
            JavaTabbedView javaTabbedView = new JavaTabbedView(
                    model.getJavaMainSnippet(),
                    model.getJavaModelSnippet(),
                    model.getJavaViewSnippet(),
                    model.getJavaControllerSnippet()
            );
            javaTabbedView.setVisible(true);
        });

        // Si vous voulez aussi gérer le bouton copier Java dans l'onglet principal
        this.view.getJavaCopyButton().addActionListener(e -> {
            String text = view.getJavaTextArea().getText();
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new java.awt.datatransfer.StringSelection(text), null);
            JOptionPane.showMessageDialog(view, "Copié dans le presse-papier !");
        });
    }

    // Méthode utilitaire pour afficher un snippet dans une nouvelle fenêtre
    private void showSnippet(String title, String snippet) {
        JFrame snippetFrame = new JFrame(title);
        JTextArea textArea = new JTextArea(snippet);
        textArea.setEditable(false);

        snippetFrame.add(new JScrollPane(textArea));
        snippetFrame.setSize(600, 400);
        snippetFrame.setLocationRelativeTo(null);
        snippetFrame.setVisible(true);
    }

    // Méthode utilitaire pour exporter vers un fichier
    private void exportToFile(String type, String extension, String content) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Exporter " + type);
        fileChooser.setSelectedFile(new java.io.File("snippet" + extension));

        int userSelection = fileChooser.showSaveDialog(view);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            java.io.File fileToSave = fileChooser.getSelectedFile();

            try (FileWriter writer = new FileWriter(fileToSave)) {
                writer.write(content);
                JOptionPane.showMessageDialog(view,
                        "Fichier exporté avec succès : " + fileToSave.getAbsolutePath());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(view,
                        "Erreur lors de l'export : " + ex.getMessage(),
                        "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}