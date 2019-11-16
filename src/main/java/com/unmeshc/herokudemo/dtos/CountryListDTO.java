package com.unmeshc.herokudemo.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Created by uc on 11/16/2019
 */
@Data
@Builder
public class CountryListDTO {

    private List<CountryDTO> countries;
}
