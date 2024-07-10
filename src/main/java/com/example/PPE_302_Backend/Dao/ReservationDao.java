package com.example.PPE_302_Backend.Dao;

import com.example.PPE_302_Backend.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationDao extends JpaRepository<Reservation, Long> {
}
