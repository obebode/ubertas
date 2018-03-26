package com.ubertas.service;


import com.ubertas.domain.Country;
import com.ubertas.dto.CountryDTO;
import com.ubertas.exception.CountryExistException;
import com.ubertas.exception.CountryNotFoundException;
import com.ubertas.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Transactional
    @Override
    public Country registerNewCountry(final CountryDTO countryDTO) {

        if (countryExist(countryDTO.getName())) {
            throw new CountryExistException("There is a country with name: " + countryDTO.getName());
        }

        final Country country = new Country();

        country.setName(countryDTO.getName());
        country.setIsoCode(countryDTO.getIsoCode());

        return countryRepository.save(country);
    }

    @Transactional(readOnly = true)
    @Override
    public Country findByIsoCode(String isoCode) {
        return countryRepository.findByIsoCode(isoCode);
    }

    @Transactional(readOnly = true)
    @Override
    public Country findByName(String name) {
        return countryRepository.findByName(name);
    }

    @Transactional(readOnly = true)
    @Override
    public String findIsoCodeByName(String name) {

        Country countryEntry = countryRepository.findByName(name);
        if (countryEntry.getName() != null) {
            return countryEntry.getIsoCode();
        } else {
            throw new CountryNotFoundException("No country with name: " + countryEntry.getName());

        }
    }

    private boolean countryExist(final String name) {
        return countryRepository.findByName(name) != null;
    }

}
