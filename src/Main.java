import controller.HubController;
import model.HubModel;
import view.HubView;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            HubModel model = new HubModel();
            HubView view = new HubView();
            new HubController(view, model);

            view.setVisible(true);
        });
    }
}
