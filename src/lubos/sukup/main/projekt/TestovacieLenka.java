package lubos.sukup.main.projekt;

import java.sql.Statement;

public class TestovacieLenka {

    // String sql1 = "SELECT * From TESTTRI WHERE name = '"+ meno.getText()+"' AND priezvisko ='"+priezvisko.getText()+"'";

    String meno;

    String priezviko;

    void hladat(){


        String ziskanemeno= meno.trim();


        if( meno.isEmpty() && !priezviko.isEmpty()){

            Statement statement;
          //  statement.execute("SELECT .....");

        }else if(!meno.isEmpty() && priezviko.isEmpty()){



        }else if(!meno.isEmpty() && !priezviko.isEmpty( )){



        }

    }
}
