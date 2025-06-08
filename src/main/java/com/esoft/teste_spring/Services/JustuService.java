package com.esoft.teste_spring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esoft.teste_spring.DTOs.JutsuDTO;
import com.esoft.teste_spring.models.Jutsu;
import com.esoft.teste_spring.repositories.JutsuRepository;

@Service
public class JustuService {

    public final JutsuRepository jutsuRepository;

    public JustuService(JutsuRepository jutsuRepository){
        this.jutsuRepository = jutsuRepository;
    }

    public List<JutsuDTO> listar(){
        return jutsuRepository.findAll()
                              .stream()
                              .map(jutsu -> new JutsuDTO(jutsu)).toList();
    }
}
