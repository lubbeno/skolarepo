package lubos.sukup.main.generator;

import java.util.Random;

public class Generator {




        public static void main(String[] args) {
            Random random = new Random();
            System.out.println(random.nextInt(500));

        }



  private int  generator() {
        Random random = new Random();
        return (random.nextInt(500));

    }
}
