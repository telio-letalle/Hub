import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PiGameController {
    private final PiGameModel model;
    private final PiGameView view;
    
    public PiGameController(PiGameModel model, PiGameView view) {
        this.model = model;
        this.view = view;

        // Écouteurs pour les chiffres
        for (int i = 0; i < 10; i++) {
            final int digit = i;
            view.getDigitButtons()[i].addActionListener(e -> handleDigitInput(digit));
        }

        // Rejouer
        view.getRestartButton().addActionListener(e -> resetGame());

        // Clavier
        view.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if (Character.isDigit(ch)) {
                    handleDigitInput(Character.getNumericValue(ch));
                }
            }
        });
        view.setFocusable(true);
        view.requestFocusInWindow();

    }

    private void handleDigitInput(int digit) {
        boolean correct = model.checkDigit(digit);
        if (correct) {
            view.showMessage("✔ Correct : " + model.getCurrentInput(), Color.GREEN);
            view.updateScore(model.getScore());
        } else {
            model.updateBestScore();
            view.updateBestScore(model.getBestScore());
            view.showMessage("✖ Faux ! C'était : " + model.getExpectedDigit()
                    + " | Saisie : " + model.getCurrentInput(), Color.RED);
            endGame();
        }
    }

    private void resetGame() {
        model.reset();
        view.setButtonsEnabled(true);
        view.updateScore(0);
        view.showMessage("C'est parti !", Color.BLACK);
    }

    private void endGame() {
        view.setButtonsEnabled(false);
    }
}
