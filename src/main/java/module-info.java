module com.nesp.sdk.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nesp.sdk.javafx to javafx.fxml;
    exports com.nesp.sdk.javafx;
}