package lubos.sukup.main.maturitky.metody;

import lubos.sukup.main.maturitky.interfaces.auto.Bicykel;

import java.util.ArrayList;
import java.util.List;

import static lubos.sukup.main.maturitky.interfaces.auto.Bicykel.spolocnaPremenna;

public class Metody {




     double nazovMetody( ) {
            System.out.println("neco");

            //vypocet


         ukazkaInstancnejMetody();

            String s = "test";
         return 2.0 ;




    }


    public void ukazkaInstancnejMetody(){

        //lubos.sukup.main.maturitky.interfaces.auto.Bicykel.radenie();

        Bicykel bycikel = new Bicykel();
        bycikel.radenie();

        lubos.sukup.main.maturitky.interfaces.auto.Bicykel.statickaMetoda();



    }

}
