package lubos.sukup.main.skupinaB.domaciMilacikovia;

public class Pes extends DomaciMilacik {

    String vernost;

    //konstruktor
    public Pes(String meno, boolean maStrst, int pocetNoch,String vernost) {
        super(meno,maStrst,pocetNoch);
        //System.out.println("koniec Konstruktora Pes");
        this.vernost = vernost;
    }
    // getters and setters


    public void pohyb(){
        System.out.println( meno + " skace a sprintuje");
    }


    public void jedenie(){
        System.out.println(meno + " zerie kosti");
    }


    @Override
    public String toString() {
        return "Pes{" +
                "meno='" + meno + '\'' +
                ", maStrst=" + maStrst +
                ", pocetNoch=" + pocetNoch +
                ", vernost='" + vernost + '\'' +
                '}';
    }
}
