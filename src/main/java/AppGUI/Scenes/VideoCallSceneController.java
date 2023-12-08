package AppGUI.Scenes;

import AppGUI.Views;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class VideoCallSceneController implements Initializable {
    public Pane endCall;
    public Pane videoOff;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        endCall.setOnMouseClicked(mouseEvent -> goToScene1());
        videoOff.setOnMouseClicked(mouseEvent -> goToVoiceCall());
    }

    public void goToScene1() {
        Views.getInstance().showAppGUI(Views.getInstance().getScene1());
    }

    public void goToVoiceCall() {
        Views.getInstance().showAppGUI(Views.getInstance().getVoiceCallScene());
    }
}
