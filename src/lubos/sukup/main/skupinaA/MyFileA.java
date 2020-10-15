package lubos.sukup.main.skupinaA;

import java.io.File;
import java.util.Arrays;

public class MyFileA {

    public static void main(String[] args) {

        File myFile = new File("src/lubos/sukup/main");


        System.out.println(myFile.getAbsolutePath());
        System.out.println(myFile.canRead());
        System.out.println(myFile.exists());
        System.out.println(myFile.getName());
        System.out.println(myFile.isDirectory());
        if(myFile.isDirectory()){
            String[]  zoznam =  myFile.list();
            for (String s : zoznam) {
                System.out.println(s);
            }

            for (int x = 0; x< zoznam.length; x++) {
                System.out.println(zoznam[x]);
            }

            Arrays.asList(myFile.list()).forEach(System.out::println);
        }
       // myFile.delete();

    }


}
