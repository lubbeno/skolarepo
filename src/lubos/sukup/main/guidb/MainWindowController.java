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

        // 1 nacitame si z GUI jednotlive string data.

        String localId = id.getText().trim();

        String localMeno = meno.getText().trim();

        String localPriez = priezvisko.getText().trim();

        String localVek = vek.getText().trim();


        // 1 vytvvorit spojenie s DB.


        String url = "jdbc:h2:tcp://localhost/C:/Users/lubossukup/JAVA/skola/DB/db.db";
        String meno = "sa";
        String heslo ="sa";

        try {
            Connection spojene = DriverManager.getConnection(url, meno, heslo);
            Statement statement = spojene.createStatement();

            String sql = "INSERT INTO TESTTRI VALUES ("+localId+",'"
                                    + localMeno+"','"+ localPriez+"',"+localVek+"); ";


            statement.execute(sql);
            select.setText("data ulozene");

        } catch (SQLException e) {
            select.setText(e.getLocalizedMessage());
            e.printStackTrace();
        }


    }






















    private Connection initDb() throws SQLException {

        String DB_URL = "jdbc:h2:tcp://localhost/C:/Users/lubossukup/JAVA/skola/DB/db.db";
        String USER = "sa";
        String PASS = "sa";

        Connection spojenie = DriverManager.getConnection(DB_URL, USER, PASS);

        return spojenie;

    }

    //@FXML
    private void loadTable(){

        // 1 vytvorim si objekt connection
        try (Connection connection = initDb()) {

            //2 vytvorim si objekt statement
            Statement statement = connection.createStatement();

            // 3 vytvorim si String s dotayzom
            String dalsi = "select * from TESTTRI";

            ResultSet rs = statement.executeQuery(dalsi);

            String vysledok="";
            while (rs.next()){

               int id =  (rs.getInt("ID"));
               String meno = rs.getString("FIRST");
               String priezvisko =rs.getString("LAST");
               int age = (rs.getInt("AGE"));

               String ciastocny = id+ " "+meno +" "+ priezvisko + " " + age + "\n";
                vysledok = vysledok+ciastocny;

            }
            select.setText(vysledok);

        }catch (SQLException ex){

            System.out.println(ex);
        }

    }

    @FXML
    public void pokus(){

        try (Connection connection = DatabaseCon.getInstance().getConnection()) {

            Statement statement = connection.createStatement();

            String dalsi = "select * from TESTTRI";

            String vysledok="";

            ResultSet rs = statement.executeQuery(dalsi);
            while (rs.next()) {

                String id = Integer.toString(rs.getInt("ID"));
                String meno = rs.getString("FIRST");
                String priezvisko = rs.getString("LAST");
                String age = Integer.toString(rs.getInt("AGE"));

                String ciastocny = id + " " + meno + " " + priezvisko + " " + age + "\n";
                vysledok = vysledok + ciastocny;

                select.setText(vysledok);

            }
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }

}


