package com.onespring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onespring.Models.Empregado;

public interface EmpregadoRepository extends JpaRepository<Empregado, Integer>{
    
}
