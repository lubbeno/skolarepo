module MyFirstGitProject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens lubos.sukup.main.guidb;
    opens lubos.sukup.main.skupinaB.database.lubosdb;
    opens lubos.sukup.main.skupinaA.databaze;
}
