package com.esoft.teste_spring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esoft.teste_spring.DTOs.JutsuDTO;
import com.esoft.teste_spring.models.Jutsu;
import com.esoft.teste_spring.repositories.JutsuRepository;

@Service
public class JutsuService {

    public final JutsuRepository jutsuRepository;

    public JutsuService(JutsuRepository jutsuRepository){
        this.jutsuRepository = jutsuRepository;
    }

    public List<JutsuDTO> listar(){
        return jutsuRepository.findAll()
                              .stream()
                              .map(jutsu -> new JutsuDTO(jutsu)).toList();
    }

    public JutsuDTO criarJutsu(Jutsu jutsu){
        return new JutsuDTO(jutsuRepository.save(jutsu));
    }
}
