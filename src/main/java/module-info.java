module com.mycompany.assignment3.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.assignment3.javafx to javafx.fxml;
    exports com.mycompany.assignment3.javafx;
}
