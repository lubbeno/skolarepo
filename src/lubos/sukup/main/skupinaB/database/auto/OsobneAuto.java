package lubos.sukup.main.skupinaB.database.auto;

import java.util.ArrayList;
import java.util.List;

public class OsobneAuto implements Motor {



    @Override
    public void startuje() {
        System.out.println("osobne auto startuje a robi VRRRRRRRR");
    }

    @Override
    public void radenie() {
        System.out.println("osobne auto ma 5 rychlosti");
    }


    public static void main(String[] args) {

        OsobneAuto osobneAuto = new OsobneAuto();
        osobneAuto.radenie();
        osobneAuto.startuje();

        Bicykel bicykel = new Bicykel();
        bicykel.radenie();
        bicykel.startuje();


    }








}
