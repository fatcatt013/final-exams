module com.example.artifact {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.artifact to javafx.fxml;
    exports com.example.artifact;
}