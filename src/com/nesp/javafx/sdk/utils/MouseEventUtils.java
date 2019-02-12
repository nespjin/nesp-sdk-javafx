package com.nesp.javafx.sdk.utils;


import javafx.scene.Node;
import javafx.stage.Stage;

public class MouseEventUtils {

    private static double xOffset = 0;
    private static double yOffset = 0;

    /**
     * 鼠标点击拖拽窗口
     *
     * @param node  拖拽节点
     * @param stage 窗口
     */
    public static void setDragToMove(Node node, Stage stage) {

        node.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });

        node.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
        });
    }
}
