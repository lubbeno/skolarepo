package lubos.sukup.main.maturitky.cykly;

public class Main{
    public static void main(String args[]){

        int i =1;

        boolean premenna = true;
        do{

            System.out.println(i);
            i++;
            if(i>10){
                premenna = false;
            }
        }while (premenna);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("hodnota i : " +i );
        for( i = 1 ; ; i++){
            if(i== 5){
                System.out.println("i sa rovna 5 a nenapise nekonecnty cyklus 5");
                continue;
            }
            System.out.println("nekonecny for " +i);
            if(i > 10){
                break;
            }
        }

        // po break sa pokracuje tu

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        String[] poleStringov = {"jedna","dva","tri"};

        for (String elementPola : poleStringov) {

            if(elementPola.length()==3) {
                System.out.println(elementPola);
            }
        }

    }

}

