package lubos.sukup.main.guidb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseCon {




   private String DB_URL = "jdbc:h2:tcp://localhost/C:/Users/lubossukup/JAVA/skola/DB/db.db";
   private String USER = "sa";
   private String PASS = "sa";


    private DatabaseCon(){

    }

    private static DatabaseCon databaseCon = null;

    public static DatabaseCon getInstance() {

        if (databaseCon == null) {
            return new DatabaseCon();

        } else {
            return databaseCon;
        }
    }


    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
