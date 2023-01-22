package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Decision;

public interface DecisionRepository extends JpaRepository<Decision, Integer> {

}
