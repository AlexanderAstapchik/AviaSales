package com.example.aviasales.dao.impl;

import com.example.aviasales.dao.CountryDao;
import com.example.aviasales.dao.EntityDao;
import com.example.aviasales.entity.Country;

public class CountryDaoImpl  extends EntityDao<Country> implements CountryDao {
    public CountryDaoImpl() { setEntityClass(Country.class);}
}
