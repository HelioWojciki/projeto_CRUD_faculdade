package com.esoft.teste_spring.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.esoft.teste_spring.DTOs.NinjaDTO;
import com.esoft.teste_spring.DTOs.VilaDTO;
import com.esoft.teste_spring.Exceptions.NaoEncontradoException;
import com.esoft.teste_spring.models.Missao;
import com.esoft.teste_spring.models.Ninja;
import com.esoft.teste_spring.models.Vila;
import com.esoft.teste_spring.repositories.NinjaRepository;
import com.esoft.teste_spring.repositories.VilaRepository;

import jakarta.transaction.Transactional;

@Service
public class VilaService {

    private final VilaRepository vilaRepository;
    private final NinjaRepository ninjaRepository;

    public VilaService(VilaRepository vilaRepository, NinjaRepository ninjaRepository){
        this.vilaRepository = vilaRepository;
        this.ninjaRepository = ninjaRepository;
    }
    
    public VilaDTO salvarVila(Vila vila){
        return new VilaDTO(vilaRepository.save(vila));
    }

    public List<VilaDTO> listar(){
        return vilaRepository.findAll().stream().map(vila -> new VilaDTO(vila)).toList();
    }

    public VilaDTO buscarVilaPorId(Long id){
        return new VilaDTO(vilaRepository.findById(id).orElseThrow(() -> new RuntimeException("Vila não encontrada!")));
    }

    @Transactional
    public ResponseEntity<Void> deletarUmaVila(Long id) throws Exception{

        Vila vilaEncontrada = vilaRepository
                            .findById(id)
                            .orElseThrow(
                                () -> new NaoEncontradoException("Vila não encontrada!"));

        List<Ninja> ninjasVinculadosComEssaVila = ninjaRepository.findByVila(vilaEncontrada); 
        if (ninjasVinculadosComEssaVila != null) {
            ninjasVinculadosComEssaVila.forEach(ninja -> {
                    ninja.setVila(null);
                    ninjaRepository.save(ninja);
                }
            );
            
        }

        vilaRepository.delete(vilaEncontrada);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        
    }
}
