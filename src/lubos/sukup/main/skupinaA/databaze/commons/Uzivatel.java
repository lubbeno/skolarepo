package lubos.sukup.main.skupinaA.databaze.commons;

public class Uzivatel extends HlavnaTabulka{

    private int age;

    private String last;

    private String first;


    public Uzivatel(){
        super(664654);
    }

    public Uzivatel(int id, int age, String last, String first) {
        super(id);
        this.age = age;
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


    @Override
    public void test() {
        System.out.println("test Uivatel");
    }

}
