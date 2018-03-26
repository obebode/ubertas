package com.ubertas.controller;


import com.ubertas.exception.CountryNotFoundException;
import com.ubertas.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class CountryController {

    private CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(value = "/countries")
    public ResponseEntity<String> findIsoCodeByName(@RequestParam(value = "name") String name) {

        String isoCode = countryService.findIsoCodeByName(name);

        if (isoCode == null) {
            throw new CountryNotFoundException("ISO Code not found");
        }

        if (isoCode.isEmpty()) {
            throw new CountryNotFoundException("ISO Code not found");
        }

        return new ResponseEntity<>(countryService.findIsoCodeByName(name), HttpStatus.OK);
    }
}
