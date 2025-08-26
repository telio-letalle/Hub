package controller;

import model.HubModel;
import view.HubView;

import javax.swing.*;

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
    }
}
