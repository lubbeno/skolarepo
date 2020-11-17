package lubos.sukup.main.skupinaA.ulohy.siete;

public class BezRekurzieSlova {

    public static void main(String[] args) {

        String mojText = "test a este jeden testtest a este jeden testtest a este jeden testtest a este jeden testtest a este jeden test";
        String cast = mojText;
        int pocet =0;

        int y;

        while (cast.length() != -1){
            if(cast.contains("test")){
                pocet++;
                y = cast.indexOf("test");
                cast = cast.substring(y+4);
            }
            else {
                break;
            }
        }

        System.out.println(pocet);

    }
}
