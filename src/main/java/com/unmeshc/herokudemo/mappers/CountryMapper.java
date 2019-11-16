package com.unmeshc.herokudemo.mappers;

import com.unmeshc.herokudemo.domain.Country;
import com.unmeshc.herokudemo.dtos.CountryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by uc on 11/16/2019
 */
@Mapper
public interface CountryMapper {

    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    CountryDTO countryToCountryDTO(Country country);
    Country countryDTOToCountry(CountryDTO countryDTO);
}
