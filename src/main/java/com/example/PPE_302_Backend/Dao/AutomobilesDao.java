package com.example.PPE_302_Backend.Dao;

import com.example.PPE_302_Backend.models.Automobiles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutomobilesDao extends JpaRepository<Automobiles, Long> {
}
