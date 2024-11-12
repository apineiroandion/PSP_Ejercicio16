import controller.AscensorController;
import model.Ascensor;
import view.FloorPanel;
import view.MainWindow;

public class App {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        FloorPanel floorPanel = new FloorPanel();
        AscensorController ascensorController = new AscensorController(ascensor, floorPanel);
        MainWindow mainWindow = new MainWindow(ascensorController, floorPanel);
        mainWindow.setVisible(true);
    }
}
