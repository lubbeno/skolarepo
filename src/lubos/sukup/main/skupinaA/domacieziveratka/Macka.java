package lubos.sukup.main.skupinaA.domacieziveratka;

public class Macka  extends DomaciMilacik{

    int velkostSrsti;

    public Macka(int pocetnoh, boolean srst, String meno, int velkostSrsti) {
        super(pocetnoh, srst,meno);
        this.velkostSrsti=velkostSrsti;
    }


    // getters setters


    public void jedenie(){
        System.out.println(meno + " zerie mysi");
    }

    public void pohyb(){
        System.out.println( meno + " ladne bezka ");
    }


    public void splhanie(){

        System.out.println( meno + " lezie po strome ");
    }

}
