package AppGUI.Scenes;

import AppGUI.Views;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Scene1Controller implements Initializable {
    public Pane voiceCall;
    public Pane videoCall;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        voiceCall.setOnMouseClicked(mouseEvent -> goToVoiceCall());
        videoCall.setOnMouseClicked(mouseEvent -> goToVideoCall());
    }

    public void goToVoiceCall() {
        Views.getInstance().showAppGUI(Views.getInstance().getVoiceCallScene());
    }

    public void goToVideoCall() {
        Views.getInstance().showAppGUI(Views.getInstance().getVideoCallScene());
    }
}
