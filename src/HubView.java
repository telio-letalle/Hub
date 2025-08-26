package view;

import javax.swing.*;
import java.awt.*;

public class HubView extends JFrame {
    private JButton htmlButton = new JButton("HTML");

    public HubView() {
        setTitle("Hub de modèles");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());
        add(htmlButton);
    }

    public JButton getHtmlButton() {
        return htmlButton;
    }
}
