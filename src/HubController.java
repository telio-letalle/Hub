package controller;

import model.HubModel;
import view.HubView;
import view.JavaTabbedView;

import javax.swing.*;
import java.awt.*;

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

        // Java Button
        this.view.getJavaButton().addActionListener(e -> {
            JavaTabbedView javaTabbedView = new JavaTabbedView(
                    model.getJavaMainSnippet(),
                    model.getJavaModelSnippet(),
                    model.getJavaViewSnippet(),
                    model.getJavaControllerSnippet()
            );
            javaTabbedView.setVisible(true);
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
}
