package view;  // Package actuel

// Imports bibliothèques
import javax.swing.*;
import java.awt.*;

public class HubView extends JFrame {
    private JButton htmlButton = new JButton("HTML");
    private JButton cssButton = new JButton("CSS");

    public HubView() {
        setTitle("Hub de modèles");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());
        add(htmlButton);
        add(cssButton);
    }

    public JButton getHtmlButton() {
        return htmlButton;
    }

    public JButton getCssButton() {
        return cssButton;
    }
}
