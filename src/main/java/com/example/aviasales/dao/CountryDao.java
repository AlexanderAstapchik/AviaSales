package com.example.aviasales.dao;

import com.example.aviasales.entity.Country;

import java.util.List;

public interface CountryDao {
    List<Country> findAll();
    void deleteById(Long idCountry);
    Country save(Country country);
    Country findById(Long idCounty);
    Country update(Country country);
}
