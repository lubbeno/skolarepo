package lubos.sukup.main.skupinaB.domaciMilacikovia;

public abstract class DomaciMilacik {

    String meno;

    boolean maStrst;

    int pocetNoch;

    public DomaciMilacik(String meno, boolean maStrst, int pocetNoch) {
        //System.out.println(meno+ " zaciatok Konstruktora DM ");
        this.meno = meno;
        this.maStrst = maStrst;
        this.pocetNoch = pocetNoch;
        //System.out.println( meno+ " koniec Konstruktora DM");
    }


    public abstract void pohyb();


    public void jedenie(){
        System.out.println(meno + " zakladne jedenie");
    }



}
