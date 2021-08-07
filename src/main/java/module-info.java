module com.nesp.sdk.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;
    requires java.base;
    requires com.nesp.sdk.java;

    opens com.nesp.sdk.javafx to javafx.fxml;
    exports com.nesp.sdk.javafx;
}