package lubos.sukup.main.skupinaA.ulohy.siete;


public class URLslova {
    static int pocet=0;
    public static void main(String[] args) {

        String mojText = "test a este jeden testtest a este jeden testtest a este jeden testtest a este jeden testtest a este jeden test";

        boolean kontrola =  mojText.contains("test a este jeden testtest a este jeden testtest a este jeden testtest a este jeden testtest a este jeden test dsds");

        rekurzia(mojText,"test");

        System.out.println(pocet);

        String firstName = "John ";
        String lastName = "Doe";
        String s1 = "Doe";
        String s3 = new String("Doe");

        System.out.println(lastName == s1);
        System.out.println(lastName == s3);

        System.out.println("porovnavame obsah "  + lastName.equals(s3));

        firstName = firstName.concat(lastName);
        System.out.println(firstName.concat(lastName));
        System.out.println(firstName);
        System.out.println(lastName);



    }



   static void rekurzia(String text, String hladany){
                if(text.contains(hladany)){
                    pocet++;
                    String podText =  text.substring(text.indexOf(hladany)+hladany.length());
                    rekurzia(podText,hladany);
        }

    }





}
