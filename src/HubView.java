package view;  // Package actuel

// Imports bibliothèques
import javax.swing.*;
import java.awt.*;

public class HubView extends JFrame {
    private JButton htmlButton = new JButton("HTML");
    private JButton cssButton = new JButton("CSS");
    private JButton javaButton = new JButton("Java");

    public HubView() {
        setTitle("Hub de modèles");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());
        add(htmlButton);
        add(cssButton);
        add(javaButton);
    }

    public JButton getHtmlButton() {
        return htmlButton;
    }

    public JButton getCssButton() {
        return cssButton;
    }

    public JButton getJavaButton() {
        return javaButton;
    }
}
