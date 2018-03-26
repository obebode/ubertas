package com.ubertas.service;


import com.ubertas.domain.Country;
import com.ubertas.dto.CountryDTO;

public interface CountryService {

    Country registerNewCountry(CountryDTO countryDTO);

    Country findByIsoCode(String isoCode);

    Country findByName(String name);

    String findIsoCodeByName(String name);

}
