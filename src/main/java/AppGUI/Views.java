package AppGUI;

import AppGUI.Scenes.Scene1Controller;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Views {
    public static Views views;
    private FXMLLoader Scene1;
    private FXMLLoader VideoCallScene;
    private FXMLLoader VoiceCallScene;
    private Stage stage;

    public Views() {

    }

    public static synchronized Views getInstance() {
        if (views == null) {
            views = new Views();
        }
        return views;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public FXMLLoader getScene1() {
        try {
            Scene1 = new FXMLLoader(getClass().getResource("/FXML/Scene1.fxml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Scene1;
    }

    public FXMLLoader getVideoCallScene() {
        try {
            VideoCallScene = new FXMLLoader(getClass().getResource("/FXML/VideoCallScene.fxml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return VideoCallScene;
    }

    public FXMLLoader getVoiceCallScene() {
        try {
            VoiceCallScene = new FXMLLoader(getClass().getResource("/FXML/VoiceCallScene.fxml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return VoiceCallScene;
    }

    public void showAppGUI(FXMLLoader fxmlLoader) {
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }
        stage.setScene(scene);
        stage.setTitle("Chat");
        stage.setResizable(false);
        stage.show();
    }
}
