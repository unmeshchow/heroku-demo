package com.unmeshc.herokudemo.services;

import com.unmeshc.herokudemo.dtos.CountryDTO;

import java.util.List;

/**
 * Created by uc on 11/16/2019
 */
public interface CountryService {

    List<CountryDTO> getAllCountries();
}
