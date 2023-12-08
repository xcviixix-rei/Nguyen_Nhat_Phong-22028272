package AppGUI.Scenes;

import AppGUI.Views;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class VoiceCallSceneController implements Initializable {
    public Pane endCall;
    public Pane videoOn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        endCall.setOnMouseClicked(mouseEvent -> goToScene1());
        videoOn.setOnMouseClicked(mouseEvent -> goToVideoCall());
    }

    public void goToScene1() {
        Views.getInstance().showAppGUI(Views.getInstance().getScene1());
    }

    public void goToVideoCall() {
        Views.getInstance().showAppGUI(Views.getInstance().getVideoCallScene());
    }
}
