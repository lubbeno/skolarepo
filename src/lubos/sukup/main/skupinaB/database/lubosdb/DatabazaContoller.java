package lubos.sukup.main.skupinaB.database.lubosdb;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import lubos.sukup.main.skupinaB.database.lubosdb.commons.Uzivatel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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


    List<Uzivatel> uzivatelia = new ArrayList<>();

    @FXML
    public void save() {

        String url = "jdbc:h2:tcp://localhost/C:/Users/lubossukup/JAVA/skola/DB/db.db";
        String name = "sa";
        String pass = "sa";
        try {
            Connection connection = DriverManager.getConnection(url, name, pass);
            Statement statement = connection.createStatement();

            // String sqlinsert = " INSERT INTO POKUSB VALUES (10, 'Lubos','Sukup', 32); ";
            int localId = Integer.parseInt(id.getText().trim());
            int localVek = Integer.parseInt(vek.getText().trim());
            String localmeno = meno.getText().trim();
            String localPriezvisko = priezvisko.getText().trim();

            String sql = "INSERT INTO TESTTRI VALUES (" + localId + ",'"
                    + localmeno + "','"
                    + localPriezvisko + "', "
                    + localVek + ");";

            statement.execute(sql);

            Uzivatel uzivatel = new Uzivatel(localId);
            //uzivatel.setId(localId);
            uzivatel.setFirst(localmeno);
            uzivatel.setAge(localVek);
            uzivatel.setLast(localPriezvisko);

            uzivatelia.add(uzivatel);

            zoznam.setText("zaznam vlozeny !!!");
            connection.close();

        } catch (SQLException e) {
            zoznam.setText(e.getLocalizedMessage());
            e.printStackTrace();
        }


    }

    @FXML
    public void load() {

        uzivatelia.clear();

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

                Uzivatel uzivatel = new Uzivatel(id);
                //uzivatel.setId(id);
                uzivatel.setFirst(meno);
                uzivatel.setAge(vek);
                uzivatel.setLast(priezvisko);

                uzivatelia.add(uzivatel);

                //System.out.println(id+ " " +meno +" " +priezvisko +" "+ vek );
                zoznamDatabaze = zoznamDatabaze + id+ " " +meno +" " +priezvisko +" "+ vek +"\n";

            }

            zoznam.setText(zoznamDatabaze);

            System.out.println(" pocet uzivatelov z listu je: " + uzivatelia.size());

            connection.close();

        } catch (SQLException e) {
            zoznam.setText(e.getLocalizedMessage());
            e.printStackTrace();
        }

    }

    @FXML
    public void priemer(){

        //sucet prvkov podelime poctom

        int sucet=0;
        int pocetPrvkov=uzivatelia.size();
        int vysledok=0;

        for (Uzivatel uzivatel : uzivatelia) {
           sucet = sucet + uzivatel.getAge();
        }

        vysledok = sucet/pocetPrvkov;

        System.out.println("priemer je: " + vysledok);

        zoznam.clear();
        zoznam.setText("priemer je: " + vysledok);
    }

    @FXML
    public void priezviska(){

        String priezvisko="";

        for (Uzivatel uzivatel : uzivatelia) {
            priezvisko = priezvisko + uzivatel.getLast() +"\n";
        }

        zoznam.setText(priezvisko);
    }
}
