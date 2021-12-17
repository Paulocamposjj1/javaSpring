package com.onespring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onespring.Models.Treinamento;

public interface TreinamentoRepository extends JpaRepository<Treinamento, Integer> {
    
}
