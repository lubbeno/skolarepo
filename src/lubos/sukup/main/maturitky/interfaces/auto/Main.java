package lubos.sukup.main.maturitky.interfaces.auto;

public class Main {

    public static void main(String[] args) {

        Bicykel bicykel1 = new Bicykel(3,
                6,"horsky bicykel");

        Bicykel bicykel2 = new Bicykel(2,1,"detsky");

        Bicykel bicykel3 = new Bicykel(4,12, "Super bicykel");

        System.out.println( "Staticka premenna "+
                Bicykel.spolocnaPremenna);


        bicykel1.pridanieStatickek();

        System.out.println( "Staticka premenna "+
                Bicykel.spolocnaPremenna);


        bicykel2.celkovyPocetstatickej();

        bicykel2.pridanieStatickek();

        bicykel3.celkovyPocetstatickej();

        bicykel1.celkovyPocetstatickej();

        bicykel2.celkovyPocetstatickej();


    }
}
