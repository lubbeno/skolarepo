package lubos.sukup.main;

import java.util.Scanner;

public class Main {
   void test() {
        System.out.println("hello world");

    }
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner scanner = new Scanner(System.in);
        System.out.print("napis text a stlac enter: ");
        String out = scanner.nextLine();
                //vypisat samohlasky a pocet samohlasiek
                //treba si napisat kod, ktory zistuje ci dane pismeno v
                // poradi je samohlaska.
                // treba si zapisat samohlasku a
                // treba zapisat pocet samohlasiek

        //tesc
        String vystup= vypocetSamohlasok(out);
        System.out.println("vystup z klavesnice: " +  out);
        System.out.println(vystup + " pocet "+ vystup.length());

         //   git init
        //    git

    }

    private static String vypocetSamohlasok(String out) {

    }

}


//https://github.com/lubbeno/skolarepo.git

/*
1. - vytvorit si na git repozitar
2. - vytvorit novy idea project
3. - pouzit git na sledovanie noveho idea
        projektu
4. - poslat si novy projekt na github
5. - poslat link na github repo mne na
        skolsky email*/















/*

    StringBuilder vystup = new StringBuilder();
    char[] polesamohlasok = new char[]{'a','e','i','o','u'};
            for (int x=0; x<out.length();x++){
        for (char c : polesamohlasok) {
        if(out.charAt(x)==c){
        vystup.append(c);
        }
        }
        }*/
