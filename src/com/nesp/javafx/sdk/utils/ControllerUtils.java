package com.nesp.javafx.sdk.utils;


import javafx.scene.layout.Region;

public class ControllerUtils {

    /**
     * 宽度绑定宽度
     *
     * @param subWidget    子控件
     * @param parentWidget 父控件
     */
    public static void bindWidth(Region subWidget, Region parentWidget) {
        subWidget.prefWidthProperty().bind(parentWidget.widthProperty());
    }


    /**
     * 高度绑定高度
     *
     * @param subWidget    子控件
     * @param parentWidget 父控件
     */
    public static void bindHeight(Region subWidget, Region parentWidget) {
        subWidget.prefHeightProperty().bind(parentWidget.heightProperty());
    }

    public static void bindHeightAndWidth(Region subWidget, Region parentWidget) {
        bindHeight(subWidget,parentWidget);
        bindWidth(subWidget,parentWidget);
    }
}
