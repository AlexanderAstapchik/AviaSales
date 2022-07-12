package com.example.aviasales.dao;

import com.example.aviasales.entity.ArrivalPoint;

public interface ArrivalPointDao {

    ArrivalPoint save(ArrivalPoint arrivalPoint);
    ArrivalPoint update(ArrivalPoint arrivalPoint);
    ArrivalPoint findById(Long id);
    void deleteById(Long id);
}
