package lubos.sukup.main.skupinaB.domaciMilacikovia;

public class Macka extends DomaciMilacik {

        String chytacMysi;

    public Macka(String meno, boolean maStrst, int pocetNoch, String chytacMysi) {
        super(meno,maStrst,pocetNoch);
        this.chytacMysi=chytacMysi;
    }

    public void pohyb(){
        System.out.println( meno + " ladne sa pohybuje");
    }


    public void jedenie(){
        System.out.println(meno + " zerie mysi");
    }


    @Override
    public String toString() {
        return "Macka{" +
                "meno='" + meno + '\'' +
                ", maStrst=" + maStrst +
                ", pocetNoch=" + pocetNoch +
                ", chytacMysi='" + chytacMysi + '\'' +
                '}';
    }
}
