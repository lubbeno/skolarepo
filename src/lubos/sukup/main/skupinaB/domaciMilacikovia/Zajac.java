package lubos.sukup.main.skupinaB.domaciMilacikovia;

public class Zajac extends DomaciMilacik{

    // mozeme pridat dalsi atribut

    public Zajac(String meno, boolean maStrst, int pocetNoch) {
        super(meno, maStrst, pocetNoch);
    }

    @Override
    public void pohyb() {
        System.out.println(meno + " hopsaaa ");
    }


}
