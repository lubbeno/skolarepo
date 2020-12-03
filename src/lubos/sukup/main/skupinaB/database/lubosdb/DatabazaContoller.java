package lubos.sukup.main.skupinaB.database.lubosdb;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabazaContoller {

    @FXML
    TextField id;

    @FXML
    TextField meno;

    @FXML
    TextField priezvisko;

    @FXML
    TextField vek;

    @FXML
    TextArea zoznam;


    @FXML
    public void save() {

        String url = "jdbc:h2:tcp://localhost/C:/Users/lubossukup/JAVA/skola/DB/db.db";
        String name= "sa";
        String pass = "sa";
        try {
            Connection    connection = DriverManager.getConnection(url, name, pass);
            Statement statement = connection.createStatement();

           // String sqlinsert = " INSERT INTO POKUSB VALUES (10, 'Lubos','Sukup', 32); ";
            String localId = id.getText().trim();
            String localVek = vek.getText().trim();
            String localmeno = meno.getText().trim();
            String localPriezvisko = priezvisko.getText().trim();

            String sql="INSERT INTO TESTTRI VALUES (" + localId + ",'"
                                                    + localmeno + "','"
                                                    + localPriezvisko + "', "
                                                    + localVek + ");";

            statement.execute(sql);

            zoznam.setText("zaznam vlozeny !!!");
            connection.close();

        } catch (SQLException e) {
            zoznam.setText(e.getLocalizedMessage());
            e.printStackTrace();
        }



    }

    @FXML
    public void load(){

    }

}
