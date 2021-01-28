package lubos.sukup.main.maturitky.operatory;

public class Ternary {

    public static void main(String[] args) {

        // vyraz ? vysledok ak je pravda : vysledok ak je nepravda;
        String s="";
        int a= 1;
        if ( a ==1 ){
            s = " je to pravda";
        }else {
            s ="je to loz";
        }

        System.out.println(s);

        // tu uz je a == 2              true        :       false
        String ternary = (a ==1) ? ("je to pravda") : ("je to loz");
        int ternary01 = (a ==1) ?  100 : 101;

        System.out.println(ternary);
    }

}
