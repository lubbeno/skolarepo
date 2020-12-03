package lubos.sukup.main.skupinaB.database.lubosdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class NovaDB {
 /*

        Vytvorite si novy balicek a do nho triedu

        a vytvorime si spojenie s nasou DB
       nainstalujeme si H2 console a vytvorime si databazu H2

       stiahneme si driver a importijeme do projektu

        1. Vytvorime si Connection objekt

        2. vytvorime si objekt Statement

        3. vytvorimse si String dotaz z SQL

        4. vlozime jeden alebo viac riadkov zaznamu
        */

    public static void main(String[] args) {


        try  {
            String url = "jdbc:h2:tcp://localhost/C:/Users/lubossukup/JAVA/skola/DB/db.db";
            String name= "sa";
            String pass = "sa";
            Connection connection = DriverManager.getConnection(url, name, pass);

            Statement statement = connection.createStatement();
            String sql =  "CREATE TABLE   POKUSB " +
                    "(id INTEGER not NULL, " +
                    " meno VARCHAR(255), " +
                    " priezvisko VARCHAR(255), " +
                    " vek INTEGER, " +
                    " PRIMARY KEY ( id ))";

            statement.execute(sql);

            System.out.println(" vytvorena tabulka POKUSB");
            String sqlinsert = " INSERT INTO POKUSB VALUES (10, 'Lubos','Sukup', 32); ";

            statement.execute(sqlinsert);
            System.out.println("vlozeny zaznam");
            connection.close();
        }catch (SQLException ex){
            System.out.println(ex);
        }






    }

}
