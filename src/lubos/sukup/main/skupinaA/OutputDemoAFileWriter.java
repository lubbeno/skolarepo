package lubos.sukup.main.skupinaA;

import java.io.FileWriter;
import java.io.IOException;

public class OutputDemoAFileWriter {

    public static void main(String[] args) {

        try {

       /*     // prepisnie celeho suboru
            FileWriter fileWriter = new FileWriter("test");
            fileWriter.write("toto je dalsia cast textu");
            fileWriter.close();*/


            FileWriter fileWriter = new FileWriter("test",true);
            fileWriter.write("\ntoto je dalsia cast textu");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
