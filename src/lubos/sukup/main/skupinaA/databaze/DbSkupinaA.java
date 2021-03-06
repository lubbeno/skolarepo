package lubos.sukup.main.skupinaA.databaze;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lubos.sukup.main.skupinaA.databaze.commons.Uzivatel;


public class DbSkupinaA extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("lubos/sukup/main/skupinaA/databaze/Databaza.fxml"));
        primaryStage.setTitle("Databaza skupina A");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);





    }
}
