package com.unmeshc.herokudemo.services;

import com.unmeshc.herokudemo.domain.Country;
import com.unmeshc.herokudemo.dtos.CountryDTO;
import com.unmeshc.herokudemo.mappers.CountryMapper;
import com.unmeshc.herokudemo.repositories.CountryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CountryServiceImplTest {

    @Mock
    private CountryRepository countryRepository;

    private CountryMapper countryMapper = CountryMapper.INSTANCE;

    private CountryService countryService;

    @BeforeEach
    void setUp() {
        countryService = new CountryServiceImpl(countryRepository, countryMapper);
    }

    @Test
    void getAllCountries() {
        List<Country> countries = Arrays.asList(
                Country.builder().id(1L).build(),
                Country.builder().id(2L).build()
        );
        when(countryRepository.findAll()).thenReturn(countries);

        List<CountryDTO> countryDTOS = countryService.getAllCountries();

        assertThat(countryDTOS.size()).isEqualTo(2);
    }
}