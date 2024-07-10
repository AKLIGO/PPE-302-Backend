package com.example.PPE_302_Backend.Dao;

import com.example.PPE_302_Backend.models.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementDao extends JpaRepository<Paiement, Long> {
}
