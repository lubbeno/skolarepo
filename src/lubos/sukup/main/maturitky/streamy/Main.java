package lubos.sukup.main.maturitky.streamy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String countries = " svk, czk, au, nemecko ";

        List<String> convertedCountriesList = Stream.of(countries.split(",", -1))
                .collect(Collectors.toList());

        convertedCountriesList.forEach(System.out::println);



        String  a = "Timotej Romancik";

        System.out.println("hard coded index: " + a.substring(5));



        System.out.println("relative index : " + a.concat(a.substring(a.indexOf('R'))));



    }

}
