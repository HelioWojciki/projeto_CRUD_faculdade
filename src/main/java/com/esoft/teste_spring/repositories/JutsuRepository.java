package com.esoft.teste_spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esoft.teste_spring.models.Jutsu;

public interface JutsuRepository extends JpaRepository<Jutsu, Long>{

    List<Jutsu> findByIdIn(List<Long> ids);
}
