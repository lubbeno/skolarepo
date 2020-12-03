package lubos.sukup.main.skupinaA.platnost;

import javafx.fxml.FXML;

import java.util.ArrayList;
import java.util.List;

public class premenne {

    String s = " text";

    public static void main(String[] args) {

        String address = "lubos+example@example.com";

        boolean test = address.matches("^[a-zA-Z0-9!'#$%&._+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");

        System.out.println(test);

    }



   static void metoda(){



       // System.out.println(s.length());

       boolean b = true;
       int x =0;
        while(b){
             // x =0
            System.out.println("trololo" + x);
            x++; // x =1
            if(x > 9){
               break;
            }

        }


        do{

        }while (false);



       for( int y = 0   ; y>10  ;  ){

           System.out.println("nekonecne for ");
       }

       List<String> pole = new ArrayList<>();

        int[] pole1 = new int[]{ 1,2,3};

        for (int s : pole1){
            System.out.println(s +5);
        }

       for( int y = 0   ; y < pole1.length  ; y++  ){

           System.out.println(pole1[y] +5);
       }


    }



    @FXML
    public void pokus(){

    }






}
