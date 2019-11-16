package com.unmeshc.herokudemo.controllers;

import com.unmeshc.herokudemo.dtos.CountryListDTO;
import com.unmeshc.herokudemo.services.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by uc on 11/16/2019
 */
@RestController
@RequestMapping("/api/v1/countries")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CountryListDTO getAllCountries() {
        return CountryListDTO.builder().countries(countryService.getAllCountries()).build();
    }
}
