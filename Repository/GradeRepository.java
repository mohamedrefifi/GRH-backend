package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Grade;

public interface GradeRepository extends JpaRepository<Grade, Integer> {

}
