package lubos.sukup.main.skupinaA.databaze.commons;

public class Adresa extends HlavnaTabulka {

    private String ulica;

    private int cislo;

   private String mesto;

    public Adresa(int id, String ulica, int cislo, String mesto) {
        super(id);
        this.ulica = ulica;
        this.cislo = cislo;
        this.mesto = mesto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getCislo() {
        return cislo;
    }

    public void setCislo(int cislo) {
        this.cislo = cislo;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }
}
