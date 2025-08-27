package view;

import javax.swing.*;
import java.awt.*;

public class JavaSnippetView extends JFrame {
    private JButton mainButton = new JButton("Main");
    private JButton controllerButton = new JButton("Controller");
    private JButton viewButton = new JButton("View");
    private JButton modelButton = new JButton("Model");

    public JavaSnippetView() {
        setTitle("Snippets Java Swing");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        add(mainButton);
        add(controllerButton);
        add(viewButton);
        add(modelButton);
    }

    public JButton getMainButton() { return mainButton; }
    public JButton getControllerButton() { return controllerButton; }
    public JButton getViewButton() { return viewButton; }
    public JButton getModelButton() { return modelButton; }
}
