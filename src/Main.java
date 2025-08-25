public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            PiGameModel model = new PiGameModel();
            PiGameView view = new PiGameView();
            new PiGameController(model, view);

            view.setVisible(true);
        });
    }
}

// 1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679