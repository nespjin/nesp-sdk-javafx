module com.nesp.sdk.javafx {
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires org.jetbrains.annotations;
    requires java.base;
    requires java.desktop;
    requires commons.math3;
    requires com.nesp.sdk.java;

    opens com.nesp.sdk.javafx to javafx.fxml;
    exports com.nesp.sdk.javafx;
    exports com.nesp.sdk.javafx.lifecycle;
    exports com.nesp.sdk.javafx.content;
}