package com.ubertas.mapper;

import com.ubertas.domain.Country;
import com.ubertas.dto.CountryDTO;

import java.util.ArrayList;
import java.util.List;

public class CountryMapper {

    public static List<CountryDTO> mapUserEntitiesIntoDTOs(Iterable<Country> entities) {
        List<CountryDTO> dtos = new ArrayList<>();

        entities.forEach(e -> dtos.add(mapUserEntityIntoDTO(e)));

        return dtos;
    }

    public static CountryDTO mapUserEntityIntoDTO(Country entity) {

        CountryDTO dto = new CountryDTO();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setIsoCode(entity.getIsoCode());

        return dto;
    }
}
