package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.PieceIdent;

public interface PieceIdentRepository extends JpaRepository<PieceIdent, Integer>{

}
