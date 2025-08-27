import controller.HubController;
import model.HubModel;
import view.HubView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Active Nimbus si dispo
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // Si Nimbus n’est pas dispo → Swing classique
            e.printStackTrace();
            System.out.println("Error loading LookAndFeel");
        }

        SwingUtilities.invokeLater(() -> {
            HubModel model = new HubModel();
            HubView view = new HubView();
            new HubController(view, model);
            view.setVisible(true);
        });
    }
}
