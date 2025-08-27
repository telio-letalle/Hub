package controller;

import model.HubModel;
import view.HubView;
import view.JavaSnippetView;

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
            showSnippet("HTML", htmlSnippet);
        });

        // Action bouton CSS
        this.view.getCssButton().addActionListener(e -> {
            String cssSnippet = model.getCssSnippet();
            showSnippet("CSS", cssSnippet);
        });

        // Action bouton Java
        this.view.getJavaButton().addActionListener(e -> {
            JavaSnippetView swingView = new JavaSnippetView();

            swingView.getMainButton().addActionListener(ev ->
                    showSnippet("Swing - Main", model.getJavaMainSnippet()));

            swingView.getControllerButton().addActionListener(ev ->
                    showSnippet("Swing - Controller", model.getJavaControllerSnippet()));

            swingView.getViewButton().addActionListener(ev ->
                    showSnippet("Swing - View", model.getJavaViewSnippet()));

            swingView.getModelButton().addActionListener(ev ->
                    showSnippet("Swing - Model", model.getJavaModelSnippet()));

            swingView.setVisible(true);
        });
    }

    // 👉 méthode utilitaire à mettre dans HubController
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
