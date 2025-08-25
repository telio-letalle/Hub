import javax.swing.*;
import java.awt.*;

public class PiGameView extends JFrame {
    private final JButton[] digitButtons = new JButton[10];
    private final JButton restartButton = new JButton("Rejouer");
    private final JLabel scoreLabel = new JLabel("Score : 0");
    private final JLabel bestScoreLabel = new JLabel("Meilleur : 0");
    private final JLabel resultLabel = new JLabel("Entrez la 1ère décimale de π");
    private final JPanel buttonsPanel = new JPanel(new GridLayout(4, 3, 5, 5));

    public PiGameView() {
        setTitle("Jeu des décimales de π");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Haut
        JPanel topPanel = new JPanel(new GridLayout(3, 1));
        topPanel.add(scoreLabel);
        topPanel.add(bestScoreLabel);
        add(topPanel, BorderLayout.NORTH);

        // Centre (boutons)
        for (int i = 1; i <= 9; i++) {
            digitButtons[i] = new JButton(String.valueOf(i));
            buttonsPanel.add(digitButtons[i]);
        }
        digitButtons[0] = new JButton("0");
        buttonsPanel.add(new JLabel()); // vide
        buttonsPanel.add(digitButtons[0]);
        buttonsPanel.add(new JLabel()); // vide
        add(buttonsPanel, BorderLayout.CENTER);

        // Bas
        JPanel bottomPanel = new JPanel(new GridLayout(2, 1));
        bottomPanel.add(resultLabel);
        bottomPanel.add(restartButton);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public JButton[] getDigitButtons() {
        return digitButtons;
    }

    public JButton getRestartButton() {
        return restartButton;
    }

    public void updateScore(int score) {
        scoreLabel.setText("Score : " + score);
    }

    public void updateBestScore(int best) {
        bestScoreLabel.setText("Meilleur : " + best);
    }

    public void showMessage(String msg, Color color) {
        resultLabel.setText(msg);
        resultLabel.setForeground(color);
    }

    public void setButtonsEnabled(boolean enabled) {
        for (JButton btn : digitButtons) btn.setEnabled(enabled);
    }
}
