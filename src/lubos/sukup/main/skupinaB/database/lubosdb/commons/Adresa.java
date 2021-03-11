package lubos.sukup.main.skupinaB.database.lubosdb.commons;

public class Adresa extends BaseDB {



    String ulica;

    String mesto;

    String stat;

    public Adresa(int id) {
       super(id);
    }

    public Adresa( int id,String ulica, String mesto, String stat) {
        super(id);
        this.ulica = ulica;
        this.mesto = mesto;
        this.stat = stat;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
}
