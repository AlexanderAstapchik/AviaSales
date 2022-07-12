package com.example.aviasales.dao.impl;

import com.example.aviasales.dao.EntityDao;
import com.example.aviasales.dao.PointOfDepartureDao;
import com.example.aviasales.entity.ArrivalPoint;
import com.example.aviasales.entity.PointOfDeparture;

public class PointOfDepartureDaoImpl extends EntityDao<PointOfDeparture> implements PointOfDepartureDao {
    public PointOfDepartureDaoImpl(){
        setEntityClass(PointOfDeparture.class);
    }
}
