package com.example.PPE_302_Backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TypesAppartements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
}
