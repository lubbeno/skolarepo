package lubos.sukup.main.guidb;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.*;

public class MainWindowController {


    @FXML
    TextField meno;


    @FXML
    TextField priezvisko;

    @FXML
    TextField vek;

    @FXML
    TextField id;

    @FXML
    TextArea select;

    @FXML
    public void save(){

        try (Connection connection = initDb()) {

            Statement statement = connection.createStatement();

            String sqlinsert = " INSERT INTO TESTTRI VALUES (2, 'Lubos','Sukup', 32); ";

            String meno =  this.meno.getText().trim();

            String priezvisko = this.priezvisko.getText().trim();

            String vek = this.vek.getText().trim();

            String id = this.id.getText().trim();

            String insert = " INSERT INTO TESTTRI VALUES ("+id+ ", '"+meno+"','"+priezvisko+"', "+vek+"); ";

            statement.execute(insert);

        }

       catch (SQLException ex){
           System.out.println(ex);
       }
    }



    private Connection initDb() throws SQLException {

        String DB_URL = "jdbc:h2:tcp://localhost/C:/Users/lubossukup/JAVA/skola/DB/db.db";
        String USER = "sa";
        String PASS = "sa";

        return DriverManager.getConnection(DB_URL, USER, PASS);

    }

    @FXML
    private void loadTable(){

        try (Connection connection = initDb();) {

            Statement statement = connection.createStatement();

            String dalsi = "select * from TESTTRI";

            String vysledok="";

            ResultSet rs = statement.executeQuery(dalsi);
            while (rs.next()){

             String id =  Integer.toString(rs.getInt("ID"));
               String meno = rs.getString("FIRST");
               String priezvisko =rs.getString("LAST");
               String age = Integer.toString(rs.getInt("AGE"));

               String ciastocny = id+ " "+meno +" "+ priezvisko + " " + age + "\n";
                vysledok = vysledok+ciastocny;

                select.setText(vysledok);
            }

        }catch (SQLException ex){

            System.out.println(ex);
        }

    }

}


