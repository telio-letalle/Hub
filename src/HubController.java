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

        // HTML Button
        this.view.getHtmlButton().addActionListener(e -> {
            JTextArea textArea = new JTextArea(model.getHtmlSnippet());
            textArea.setEditable(false);
            view.getTabbedPane().setComponentAt(0, new JScrollPane(textArea));
            view.getTabbedPane().setSelectedIndex(0);
        });

        // CSS Button
        this.view.getCssButton().addActionListener(e -> {
            JTextArea textArea = new JTextArea(model.getCssSnippet());
            textArea.setEditable(false);
            view.getTabbedPane().setComponentAt(1, new JScrollPane(textArea));
            view.getTabbedPane().setSelectedIndex(1);
        });

        // Java Button
        this.view.getJavaButton().addActionListener(e -> {
            JavaSnippetView javaView = new JavaSnippetView();

            javaView.getMainButton().addActionListener(ev ->
                    showSnippet("Java - Main", model.getJavaMainSnippet()));

            javaView.getModelButton().addActionListener(ev ->
                    showSnippet("Java - Model", model.getJavaModelSnippet()));

            javaView.getViewButton().addActionListener(ev ->
                    showSnippet("Java - View", model.getJavaViewSnippet()));

            javaView.getControllerButton().addActionListener(ev ->
                    showSnippet("Java - Controller", model.getJavaControllerSnippet()));

            javaView.setVisible(true);
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
