package lubos.sukup.main.skupinaA.domacieziveratka;

public class Kralik extends DomaciMilacik{

    public Kralik(int pocetnoh, boolean srst, String meno) {
        super(pocetnoh, srst, meno);
    }

    @Override
    public void jedenie() {
        System.out.println(meno + " chrumka mrkvicku");
    }

    @Override
    public void pohyb() {
        System.out.println(meno + " hopka ");
    }
}
