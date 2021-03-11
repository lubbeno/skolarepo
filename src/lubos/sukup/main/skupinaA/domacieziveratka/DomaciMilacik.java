package lubos.sukup.main.skupinaA.domacieziveratka;

public abstract class DomaciMilacik {

    int pocetnoh;

    boolean srst;

    String meno;

    public DomaciMilacik(int pocetnoh, boolean srst, String meno) {
        this.pocetnoh = pocetnoh;
        this.srst = srst;
        this.meno = meno;
    }


    public abstract void jedenie();

    public abstract void pohyb();

}
