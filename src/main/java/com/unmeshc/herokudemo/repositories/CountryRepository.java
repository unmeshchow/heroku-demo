package com.unmeshc.herokudemo.repositories;

import com.unmeshc.herokudemo.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by uc on 11/16/2019
 */
public interface CountryRepository extends JpaRepository<Country, Long> {
}
