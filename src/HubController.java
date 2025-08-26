package controller;  // Package actuel

// Imports autres packages
import model.HubModel;
import view.HubView;

import javax.swing.*;   // Import bibliothèque Swing

public class HubController {
    private HubView view;
    private HubModel model;

    public HubController(HubView view, HubModel model) {
        this.view = view;
        this.model = model;

        // Action bouton HTML
        this.view.getHtmlButton().addActionListener(e -> {
            String htmlSnippet = model.getHtmlSnippet();

            // Créer une fenêtre pour afficher le code
            JFrame snippetFrame = new JFrame("HTML");
            JTextArea textArea = new JTextArea(htmlSnippet);
            textArea.setEditable(false);

            snippetFrame.add(new JScrollPane(textArea));
            snippetFrame.setSize(600, 400);
            snippetFrame.setLocationRelativeTo(null);
            snippetFrame.setVisible(true);
        });

        // Action bouton CSS
        this.view.getCssButton().addActionListener(e -> {
            String cssSnippet = model.getCssSnippet();

            // Créer une fenêtre pour afficher le code
            JFrame snippetFrame = new JFrame("CSS");
            JTextArea textArea = new JTextArea(cssSnippet);
            textArea.setEditable(false);

            snippetFrame.add(new JScrollPane(textArea));
            snippetFrame.setSize(600, 400);
            snippetFrame.setLocationRelativeTo(null);
            snippetFrame.setVisible(true);
        });
    }
}
