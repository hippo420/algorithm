module com.example.programmers_solution {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jsoup;


    opens com.example.programmers_solution to javafx.fxml;
    exports com.example.programmers_solution;
}