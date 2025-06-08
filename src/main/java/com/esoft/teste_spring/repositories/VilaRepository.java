package com.esoft.teste_spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esoft.teste_spring.models.Vila;

@Repository
public interface VilaRepository extends JpaRepository<Vila, Long> {

    List<Vila> findByIdIn(List<Long> ids);
    
}
