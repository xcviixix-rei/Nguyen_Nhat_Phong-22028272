module Scenes {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens AppGUI.Scenes to javafx.fxml;
    exports AppGUI.Scenes;
    exports AppGUI;
    opens AppGUI to javafx.fxml;
}