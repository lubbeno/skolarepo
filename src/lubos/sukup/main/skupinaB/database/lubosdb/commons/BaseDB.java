package lubos.sukup.main.skupinaB.database.lubosdb.commons;

public abstract class BaseDB {

    int id;

    public BaseDB(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
