package com.nesp.javafx.sdk.utils;

import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ResourcesUtils {

    public static Image getImageByStream(Object controller, String path) {
        return new Image(controller.getClass().getResourceAsStream(path));
    }

    public static Image getImageByStream(Stage stage, String path) {
        return new Image(stage.getClass().getResourceAsStream(path));
    }
}
