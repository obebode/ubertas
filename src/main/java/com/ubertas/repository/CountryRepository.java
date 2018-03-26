package com.ubertas.repository;

import com.ubertas.domain.Country;
import com.ubertas.dto.CountryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Country findByIsoCode(String isoCode);

    Country findByName(String name);

    CountryDTO findById(long id);

}
