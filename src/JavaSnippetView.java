package view;

import javax.swing.*;
import java.awt.*;

public class JavaSnippetView extends JFrame {
    private JButton mainButton;
    private JButton modelButton;
    private JButton viewButton;
    private JButton controllerButton;

    public JavaSnippetView() {
        setTitle("Choisir un snippet Java");
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));

        mainButton = new JButton("Main");
        modelButton = new JButton("Model");
        viewButton = new JButton("View");
        controllerButton = new JButton("Controller");

        panel.add(mainButton);
        panel.add(modelButton);
        panel.add(viewButton);
        panel.add(controllerButton);

        add(panel);
    }

    public JButton getMainButton() { return mainButton; }
    public JButton getModelButton() { return modelButton; }
    public JButton getViewButton() { return viewButton; }
    public JButton getControllerButton() { return controllerButton; }
}
