package com.unmeshc.herokudemo.services;

import com.unmeshc.herokudemo.dtos.CountryDTO;
import com.unmeshc.herokudemo.mappers.CountryMapper;
import com.unmeshc.herokudemo.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by uc on 11/16/2019
 */
@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    public CountryServiceImpl(CountryRepository countryRepository,
                              CountryMapper countryMapper) {
        this.countryRepository = countryRepository;
        this.countryMapper = countryMapper;
    }

    @Override
    public List<CountryDTO> getAllCountries() {
        return countryRepository.findAll()
                .stream()
                .map(countryMapper::countryToCountryDTO)
                .collect(Collectors.toList());
    }
}
