package lubos.sukup.main.maturitky.polia;

import lubos.sukup.main.maturitky.interfaces.auto.Bicykel;

import java.util.Arrays;

public class PoliaArray {

    public static void main(String[] args) {

        Arrays arrays;

        int[] x={3,5,1,4,2};

        int[] z={3,5,1,4,2};

        String[] mena = new String[]{"pepa","honza","jenda"};

        String test[]= new String[]{"pepa","honzaaaa","jenda"};

        String []test2 = new String[]{"pepa","honza","jenda"};

        Bicykel[] bicykels = {new Bicykel(),new Bicykel(),new Bicykel()};

        System.out.println("---------------------pred zoradenim----------------------------");
        System.out.println(Arrays.toString(test));

        System.out.println("--------------------po  zoradeni----------------------------");
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));



        x[0] =10;
        int sucetPrvychDvochElementov= x[0] + x[1];



        System.out.println(" prvy element: " + x[0]);

        System.out.println(" sucet: " + sucetPrvychDvochElementov);

        //prazdne pole automaticky doplni zakladne hodnoty u int je to 0
        boolean[] poleBolean= new boolean[5];
        poleBolean[2] = true;
        for (boolean b : poleBolean) {
            System.out.println(b);
        }
        //System.out.println(y[2]);

        for (int t = 0; t<poleBolean.length;t++){
            System.out.println(poleBolean[t]);
        }

    }
}
