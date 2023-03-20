module com.example.snakes_and_ladder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakes_and_ladder to javafx.fxml;
    exports com.example.snakes_and_ladder;
}