package com.example.PPE_302_Backend.Dao;

import com.example.PPE_302_Backend.models.Utilisateurs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurDao extends JpaRepository<Utilisateurs, Long> {

}
