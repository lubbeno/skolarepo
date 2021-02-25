package lubos.sukup.main.skupinaA.databaze;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import lubos.sukup.main.skupinaA.databaze.commons.Uzivatel;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DatabazaController {
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
            int localId = generator();
            int localVek = Integer.parseInt(vek.getText().trim());
            String localmeno = meno.getText().trim();
            String localPriezvisko = priezvisko.getText().trim();



            String sql = "INSERT INTO TESTTRI VALUES (" + localId + ",'"
                    + localmeno + "','"
                    + localPriezvisko + "', "
                    + localVek + ");";

            statement.execute(sql);

            zoznam.setText("zaznam vlozeny !!!");

            uzivatelia.add(new Uzivatel(localId,localVek,localPriezvisko,localmeno));

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

                Uzivatel uzivatel = new Uzivatel();

                int id = vystupZDatabazy.getInt("ID");
                int vek =  vystupZDatabazy.getInt("AGE");
                String meno =  vystupZDatabazy.getString("FIRST");
                String priezvisko =  vystupZDatabazy.getString("LAST");


                uzivatel.setId(id);
                uzivatel.setAge(vek);
                uzivatel.setFirst(meno);
                uzivatel.setLast(priezvisko);

                uzivatelia.add(uzivatel);

                //System.out.println(id+ " " +meno +" " +priezvisko +" "+ vek );
                zoznamDatabaze = zoznamDatabaze + id+ " " +meno +" " +priezvisko +" "+ vek +"\n";
            }


            Thread vlakno = new Thread();
            vlakno.start();
            vlakno.sleep(5000);

            zoznam.setText(zoznamDatabaze);


            connection.close();

        } catch (SQLException e) {
            zoznam.setText(e.getLocalizedMessage());
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public void priemer() {
        int sucet=0;
        int pocetPrvkov=uzivatelia.size();
        int vysledok=0;

        for (Uzivatel uzivatel : uzivatelia) {
            sucet = sucet + uzivatel.getAge();
        }

        vysledok = sucet/pocetPrvkov;

        System.out.println("pocet uzivatelv je: " + uzivatelia.size());

        zoznam.clear();
        zoznam.setText("priemer je: " + vysledok);
    }


    public void priezviska() {

        String prizviska="";
        for (Uzivatel uzivatel : uzivatelia) {
            prizviska = prizviska + uzivatel.getLast() + "\n";
        }

        zoznam.clear();
        zoznam.setText("PRIEZVISKA SU: \n" + prizviska);
    }

    public int generator(){
        return new Random().nextInt();
    }

}
