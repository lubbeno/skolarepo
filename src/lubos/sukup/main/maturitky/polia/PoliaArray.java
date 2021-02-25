package lubos.sukup.main.maturitky.polia;

import lubos.sukup.main.maturitky.interfaces.auto.Bicykel;
import lubos.sukup.main.maturitky.interfaces.auto.MojInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
        System.out.println(test.toString());

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

        /////////////////////////////////ARRAYLIST/////////////////////////////////////////////////////////


        {
            String[] strings = new String[4];

            ArrayList<String> list = new ArrayList<>();
            list.add("janko");
            list.add("jozko");
            list.add("petko");

            System.out.println(list.toString());

            list.add(1,"lubos");

            ArrayList<Bicykel> listBicyklov = new ArrayList<>();
            listBicyklov.add(new Bicykel());
            listBicyklov.add(new Bicykel());
            listBicyklov.add(new Bicykel());
            listBicyklov.add(1,new Bicykel());


            System.out.println(list.toString());
            list.remove("lubos");
            System.out.println(list.toString());

            System.out.println(list.contains("petko"));

            list.set(1,"lubos");

            System.out.println(list.toString());

            /// zmena pola[] na list
          //  String poleString[]= new String[]{"janko","jozko","martinko"};

          //  List<String> premnenyZoString = Arrays.asList(poleString);



            String[] premenenyZList = list.toArray(new String[list.size()]);

            System.out.println(Arrays.toString(premenenyZList));


            int primitivny = 2;

            MojInteger mojInteger = new MojInteger();
            mojInteger.setCislo(2);
            int dasji = mojInteger.getCislo();

            Integer cisloIn = 2;
                   int intttt= cisloIn.intValue();




                List<Integer> cisla = new ArrayList<>();


        }
    }


}
