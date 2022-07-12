package com.example.aviasales.dao.impl;

import com.example.aviasales.dao.EntityDao;
import com.example.aviasales.dao.ReservationDAO;
import com.example.aviasales.entity.Reservation;

public class ReservationDAOImpl extends EntityDao<Reservation> implements ReservationDAO {
    public ReservationDAOImpl() {
        setEntityClass(Reservation.class);
    }
}
