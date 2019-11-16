package com.unmeshc.herokudemo.bootstrap;

import com.unmeshc.herokudemo.domain.Country;
import com.unmeshc.herokudemo.repositories.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by uc on 11/16/2019
 */
@Component
public class BootstrapData implements CommandLineRunner {

    private final CountryRepository countryRepository;

    public BootstrapData(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCountryData();
    }

    private void loadCountryData() {
        Country bangladesh = Country.builder().name("Bangladesh").build();
        Country india = Country.builder().name("India").build();
        Country nepal = Country.builder().name("Nepal").build();
        Country pakistan = Country.builder().name("Pakistan").build();
        Country america = Country.builder().name("America").build();

        List<Country> countries = Arrays.asList(bangladesh, india, nepal, pakistan, america);
        countryRepository.saveAll(countries);

    }
}
