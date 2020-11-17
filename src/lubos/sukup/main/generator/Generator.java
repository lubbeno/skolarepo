package lubos.sukup.main.generator;

import java.util.Random;

public class Generator {

    char a = 'a';
    float er = 5.4f;


    public static void main(String[] args) {
        Random random = new Random();
           System.out.println(random.nextInt(10)+1);
    }
}
