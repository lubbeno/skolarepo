package lubos.sukup.main.skupinaA.databaze.commons;

public abstract class HlavnaTabulka {

    private int id;

    public HlavnaTabulka(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void test();
}
