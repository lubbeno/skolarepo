package lubos.sukup.main.skupinaB.domaciMilacikovia;

public class DomaciMilaciakovaMain {

    public static void main(String[] args) {

        Pes pes = new Pes("Dunco",true,4, " super vernost");
        System.out.println(pes.toString());
        pes.jedenie();
        pes.pohyb();

        Macka macka = new Macka("Cica mica",false,3," je leniva nic nechyti");
       macka.jedenie();
       macka.pohyb();
        System.out.println(macka.toString());


        Zajac zajac = new Zajac("bunny",true,4);
        zajac.jedenie();
        zajac.pohyb();
        System.out.println(zajac.toString());

        // u abstaktnej triedy toto nejde
       // DomaciMilacik dm = new DomaciMilacik("milacik", true,0);
    }
}
