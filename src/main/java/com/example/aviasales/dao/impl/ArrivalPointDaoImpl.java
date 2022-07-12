package com.example.aviasales.dao.impl;

import com.example.aviasales.dao.ArrivalPointDao;
import com.example.aviasales.dao.EntityDao;
import com.example.aviasales.entity.ArrivalPoint;

public class ArrivalPointDaoImpl extends EntityDao<ArrivalPoint> implements ArrivalPointDao {
    public ArrivalPointDaoImpl(){
        setEntityClass(ArrivalPoint.class);
    }

}
