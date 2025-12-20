package Lab5_JavaWorldStreamAssignment;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;



public class Exercise2 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        List<Country> allCountries = countryDao.findAllCountries();

        Map<String, Optional<City>> citiesByContinent = allCountries.stream()
                .collect(Collectors.groupingBy(
                        Country::getContinent,
                        Collectors.flatMapping(
                                country -> country.getCities().stream(),
                                Collectors.maxBy(Comparator.comparing(City::getPopulation))
                        )
                ));

        citiesByContinent.forEach((continent, cityOptional) -> {
            String cityInfo = cityOptional
                    .map(city -> city.getName() + " " + city.getPopulation())
                    .orElse("No cities");

            System.out.printf("%-15s: %s%n", continent, cityInfo);
        });
    }
}
