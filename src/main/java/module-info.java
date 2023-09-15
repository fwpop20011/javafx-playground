module com.example.todo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.todo to javafx.fxml;
    exports com.example.todo;
    exports com.example.todo.popups;
    opens com.example.todo.popups to javafx.fxml;
}