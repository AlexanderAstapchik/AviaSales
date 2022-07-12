package com.example.aviasales.dao;

import com.example.aviasales.entity.ArrivalPoint;
import com.example.aviasales.entity.PointOfDeparture;

public interface PointOfDepartureDao {
    PointOfDeparture save(PointOfDeparture pointOfDeparture );
    PointOfDeparture update(PointOfDeparture pointOfDeparture);
    PointOfDeparture findById(Long id);
    void deleteById(Long id);
}
