package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Enfant;

public interface EnfantRepository extends JpaRepository<Enfant, Integer>{

}
