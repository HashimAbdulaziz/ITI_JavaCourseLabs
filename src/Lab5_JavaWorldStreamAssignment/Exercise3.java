package Lab5_JavaWorldStreamAssignment;



import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;

import static java.util.Comparator.comparing;

public class Exercise3 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
        //write your answer here

        Optional<City> highestCapital = countryDao.findAllCountries().stream()
                .map(country ->
                        cityDao.findCityById(country.getCapital()))
                .filter(Objects::nonNull)
                .max(Comparator.comparing(City::getPopulation));

        highestCapital.ifPresent(city -> System.out.println(city.getName()));
    }

}