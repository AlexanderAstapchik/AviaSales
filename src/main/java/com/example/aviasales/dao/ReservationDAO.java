package com.example.aviasales.dao;

import com.example.aviasales.entity.Reservation;

import java.util.List;

public interface ReservationDAO {
    Reservation save(Reservation reservation);
    Reservation update(Reservation reservation);
    Reservation findById(Long id);
    void deleteById(Long id);
    List<Reservation> findAll();
    List<Reservation> findAllByUserId(Long idUser);
}
