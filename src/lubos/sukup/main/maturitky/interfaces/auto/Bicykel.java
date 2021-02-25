package lubos.sukup.main.maturitky.interfaces.auto;

import lubos.sukup.main.maturitky.metody.Metody;
// Uzivatel parametre su stlpce tabulky. gettters/setters 2 Const- prazdny a kompletny

public class Bicykel implements Motor {

   private int pocetPrevodovpredny;

    private int pocetPrevodovZadny;

    private String nazov;

     public static  int spolocnaPremenna=0;

    public Bicykel() {

    }

    public Bicykel(int pocetPrevodovpredny, int pocetPrevodovZadny, String nazov) {
        this.pocetPrevodovpredny = pocetPrevodovpredny;
        this.pocetPrevodovZadny = pocetPrevodovZadny;
        this.nazov = nazov;

    }

    @Override
    public void startuje() {
        System.out.println("clovicek slape do pedalu a funi");
    }

    @Override
    public void radenie() {
        System.out.println("bicykel ma 18 rychlosti");
    }


    public int getPocetPrevodovpredny() {
        return pocetPrevodovpredny;
    }

    public void setPocetPrevodovpredny(int pocetPrevodovpredny) {
        this.pocetPrevodovpredny = pocetPrevodovpredny;
    }

    public int getPocetPrevodovZadny() {
        return pocetPrevodovZadny;
    }

    public void setPocetPrevodovZadny(int pocetPrevodovZadny) {
        this.pocetPrevodovZadny = pocetPrevodovZadny;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }


    public void celkovyPocetstatickej(){
         //   spolocnaPremenna++;
        System.out.println("staticka premenna z instancnej metody : " + this.getNazov()+" " + spolocnaPremenna);
      // return pocetPrevodovpredny*pocetPrevodovZadny;

    }

    public static String statickaMetoda(){
        return "staticka metoda";
    }

    public static int getSpolocnaPremenna() {

        System.out.println(spolocnaPremenna);
        return spolocnaPremenna;



    }


    public static void setSpolocnaPremenna(int spolocnaPremenna) {
        Bicykel.spolocnaPremenna = spolocnaPremenna;
    }

    public void pridanieStatickek(){
        spolocnaPremenna++;
    }

}
