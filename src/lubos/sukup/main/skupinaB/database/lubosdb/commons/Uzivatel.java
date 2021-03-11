package lubos.sukup.main.skupinaB.database.lubosdb.commons;

public class Uzivatel extends BaseDB {




    private int age;

    private String last;

    private String first;

    public Uzivatel(int id) {
        super(id);
    }

    public Uzivatel(int id, int age, String last, String first) {
        super(id);
        this.id = id;
        setAge(age);
        this.last = last;
        this.first = first;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            this.age = age*(-1);
        }else {
            this.age = age;
        }
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }
}
