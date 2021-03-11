package lubos.sukup.main.skupinaA.domacieziveratka;

public class Pes extends DomaciMilacik {

    String vernost;

    public Pes(int pocetNoch, boolean srst, String meno, String vernost){
        super(pocetNoch,srst,meno);
        System.out.println("konstruktor pes koniec");
    }

    // getters and setters

    public void aportovanie(){
        System.out.println( meno  + " aportuje ");
    }



    @Override
    public String toString() {
        return "Pes{" +
                "pocetnoh=" + pocetnoh +
                ", srst=" + srst +
                ", meno='" + meno + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Pes pes = new Pes( 3 ,  false, "Havo", " je super verny" );
        System.out.println( " +++++++++++++" + pes.toString());
            pes.aportovanie();
            pes.jedenie();
            pes.pohyb();

            Macka macka = new Macka(4,true,"Mica",20);

            macka.jedenie();
            macka.pohyb();

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
            Kralik kralik = new Kralik(4,true,"bunny");
            kralik.pohyb();

    }

    @Override
    public void jedenie() {
        System.out.println( meno + " zerie kosti");
    }

    @Override
    public void pohyb() {
        System.out.println(meno + " sprintuje");
    }
}
