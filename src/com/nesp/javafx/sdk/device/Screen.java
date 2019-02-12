package com.nesp.javafx.sdk.device;

public class Screen {

    public static double getCenterStateScreenPointX() {
        return getScreenWidth() / 6;
    }

    public static double getCenterStateScreenPointY() {
        return getScreenHeight() / 6;
    }

    public static double getCenterStateScreenPointX(double stateWidth) {
        return (getScreenWidth() - stateWidth) / 2;
    }

    public static double getCenterStateScreenPointY(double stateHeight) {
        return (getScreenHeight() - stateHeight) / 2;
    }

    public static double getScreenWidth() {
        return javafx.stage.Screen.getPrimary().getBounds().getMaxX();
    }

    public static double getScreenHeight() {
        return javafx.stage.Screen.getPrimary().getBounds().getMaxY();
    }

}
