package AppGUI;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Views.getInstance().setStage(stage);
        Views.getInstance().showAppGUI(Views.getInstance().getScene1());
    }

    public static void main(String[] args) {
        launch(args);
    }
}