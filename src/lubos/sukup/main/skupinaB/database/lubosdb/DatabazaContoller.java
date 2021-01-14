package lubos.sukup.main.skupinaB.database.lubosdb;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.*;

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
        String name = "sa";
        String pass = "sa";
        try {
            Connection connection = DriverManager.getConnection(url, name, pass);
            Statement statement = connection.createStatement();

            // String sqlinsert = " INSERT INTO POKUSB VALUES (10, 'Lubos','Sukup', 32); ";
            String localId = id.getText().trim();
            String localVek = vek.getText().trim();
            String localmeno = meno.getText().trim();
            String localPriezvisko = priezvisko.getText().trim();

            String sql = "INSERT INTO TESTTRI VALUES (" + localId + ",'"
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
    public void load() {

        String url = "jdbc:h2:tcp://localhost/C:/Users/lubossukup/JAVA/skola/DB/db.db";
        String name = "sa";
        String pass = "sa";
        try {
            Connection connection = DriverManager.getConnection(url, name, pass);
            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM TESTTRI;";


            ResultSet vystupZDatabazy = statement.executeQuery(sql);

            String zoznamDatabaze="ID MENO PRIEZVICKO VEK \n";
            while (vystupZDatabazy.next()){


               int id = vystupZDatabazy.getInt("ID");
              String meno =  vystupZDatabazy.getString("FIRST");
              int vek =  vystupZDatabazy.getInt("AGE");
             String priezvisko =  vystupZDatabazy.getString("LAST");

                //System.out.println(id+ " " +meno +" " +priezvisko +" "+ vek );
                zoznamDatabaze = zoznamDatabaze + id+ " " +meno +" " +priezvisko +" "+ vek +"\n";
            }

            zoznam.setText(zoznamDatabaze);

            connection.close();

        } catch (SQLException e) {
            zoznam.setText(e.getLocalizedMessage());
            e.printStackTrace();
        }

    }
}
