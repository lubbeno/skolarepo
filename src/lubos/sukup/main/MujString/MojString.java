package lubos.sukup.main.MujString;

public class MojString {

    public static void main(String[] args) {

        String s1 = "jano";
        String s2 = "jano";

        String s3 = new String("jano");

        // Vysledok porovnavania je true
        boolean rovnajuSa = s1 == s2;
        System.out.println(" s1 a s2 boolean je: " + rovnajuSa);

        // Vysledok porovnavania je false
        boolean neRovnajuSa = s1 == s3;
        System.out.println(" s1 a s3 boolean je: " + neRovnajuSa);

        // Vysledok porovnavania je true
        boolean rovnajuSaEquals = s1.equals(s3);
        System.out.println(" s1 a s3 boolean je: " + rovnajuSaEquals);


        StringBuilder stringBuilder = new StringBuilder("jano");



    }


}
