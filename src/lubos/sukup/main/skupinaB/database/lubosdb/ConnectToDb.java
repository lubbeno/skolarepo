package lubos.sukup.main.skupinaB.database.lubosdb;

import javafx.event.ActionEvent;
import lubos.sukup.main.guidb.DatabaseCon;

import java.net.MalformedURLException;
import java.sql.*;

public class ConnectToDb {

    public static void main(String[] args) throws SQLException {
        String DB_URL = "jdbc:h2:tcp://localhost/C:/Users/lubossukup/JAVA/skola/DB/db.db";
        String USER = "sa";
        String PASS = "sa";
        Statement stmt;

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);


        stmt = conn.createStatement();
        String sql =  "CREATE TABLE   TESTTRI " +
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " +
                " last VARCHAR(255), " +
                " age INTEGER, " +
                " PRIMARY KEY ( id ))";
       // stmt.executeUpdate(sql);
        System.out.println("Created table in given database...");

        String sqlinsert = " INSERT INTO TESTTRI VALUES (2, 'Lubos','Sukup', 32); ";

        //stmt.execute(sqlinsert);

       String dalsi = "select * from TESTTRI";
        ResultSet rs = stmt.executeQuery(dalsi);
        rs.next();
        rs.getString(1);
        while (rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString("first"));
            System.out.println(rs.getString("last"));

            System.out.println("-----------------------------------------------");
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
        }
        String schema = conn.getSchema();

        System.out.println(schema);

    }


    static int cisloTlacidla=0;



}
