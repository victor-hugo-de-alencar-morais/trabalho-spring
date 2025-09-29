package com.spring.tarefa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.tarefa.entity.Casa;

public interface CasaRepository extends JpaRepository<Casa, Integer> {
   
}
