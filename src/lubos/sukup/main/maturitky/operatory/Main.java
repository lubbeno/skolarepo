package lubos.sukup.main.maturitky.operatory;

public class Main {

    public static void main(String[] args) {

        int a =10;
        int b =1;

        int c = b!=0 ? a/b: 0;

        String  test = b!=0 ? "mozme delit ": "nemozme delit";

        System.out.println(c);
// unarny operator
        int unarny = 2;

        unarny = 2 +1;

        unarny++;

        ++unarny;


        int x = 1;
        int y = 2;
        int z = x++ + y;


        int v = 1;
        int u = ++v + y;

        System.out.println(" " + z + " " + u);

        // výraz1 ? výraz2 : výraz3

        int i =0;

        String vysledok="";

        if(i==0){
            vysledok =" i je rovne 0";
        }else {
            vysledok =" i je nerovne 0";
        }

        String vysledok1 = (i==0) ? " i je rovne 0" : " i je nerovne 0";

        System.out.println(vysledok);





    }
}
