package com.unmeshc.herokudemo.mappers;

import com.unmeshc.herokudemo.domain.Country;
import com.unmeshc.herokudemo.dtos.CountryDTO;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountryMapperTest {

    private CountryMapper countryMapper = CountryMapper.INSTANCE;

    @Test
    void countryToCountryDTO() {
        Country country = Country.builder().name("Bangladesh").build();
        CountryDTO countryDTO = countryMapper.countryToCountryDTO(country);

        assertThat(countryDTO.getName()).isEqualTo(country.getName());
    }

    @Test
    void countryDTOToCountry() {
        CountryDTO countryDTO = CountryDTO.builder().name("Bangladesh").build();
        Country country = countryMapper.countryDTOToCountry(countryDTO);

        assertThat(country.getName()).isEqualTo(countryDTO.getName());
    }
}