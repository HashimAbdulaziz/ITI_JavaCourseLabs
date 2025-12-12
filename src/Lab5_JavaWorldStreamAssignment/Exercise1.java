package Lab5_JavaWorldStreamAssignment;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;





public class Exercise1 {

   public static void main(String[] args) {
      CountryDao countryDao= InMemoryWorldDao.getInstance();
      //write your answer here
       List<Country> allCountries = countryDao.findAllCountries();

        /*
       Country c;
       Optional<City> highestPopulatedCity = c.getCities().stream()
               .max(Comparator.comparing(City::getPopulation)); */

       List<City> highestCities = allCountries.stream().map(country ->
               country.getCities().stream().max(Comparator.comparing(City::getPopulation)))
               .filter(Optional::isPresent)
               .map(Optional::get)
               .collect(Collectors.toList());

       highestCities.forEach(System.out::println);

   }

}