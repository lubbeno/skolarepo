package lubos.sukup.main.maturitky.streamy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String countries = " svk, czk, au, nemecko ";

        List<String> convertedCountriesList = Stream.of(countries.split(",", -1))
                .collect(Collectors.toList());

        convertedCountriesList.forEach(System.out::println);

        String addresss = "Adam Jirat/Czech \n Republic/IBM@IBM";

        System.out.println(addresss.matches(".*?/.*?/IBM(@IBM*)$"));

       // lubos.sukup@cz.ibm.com, Lubos Sukup/Czech Republic/IBM@IBM, test@test.com, testjdenda@trello.com

        String  a = "Timotej Romancik";

        System.out.println("hard coded index: " + a.substring(5));

        //int c = a.indexOf('R');
        ;

        System.out.println("relative index : " + a.concat(a.substring(a.indexOf('R'))));


    }
}
