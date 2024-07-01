module com.example.studentinfo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentinfo to javafx.fxml;
    exports com.example.studentinfo;
}