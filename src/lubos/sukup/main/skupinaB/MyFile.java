package lubos.sukup.main.skupinaB;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class MyFile {

    public static void main(String[] args) {

       myFile();

    }

    public static void myFile(){

        File myFile = new File("src/lubos/sukup/main");

        System.out.println(myFile.getAbsolutePath());
        System.out.println(myFile.canRead());
        System.out.println(myFile.exists());
        System.out.println(myFile.getName());
        System.out.println(myFile.isDirectory());
        if(myFile.isDirectory()){
            Arrays.asList(myFile.list()).forEach(System.out::println);
        }


    }

}
