package com.esoft.teste_spring.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esoft.teste_spring.DTOs.VilaDTO;
import com.esoft.teste_spring.Services.VilaService;
import com.esoft.teste_spring.models.Vila;

@RestController
@RequestMapping("/vilas")
public class VilaController {

    @Autowired
    VilaService vilaService;

    @PostMapping
    public VilaDTO criar(@RequestBody Vila vila) throws Exception{ 
        return vilaService.salvarVila(vila);
    }

    @GetMapping
    public List<VilaDTO> buscarTodasAsVilas() {
        return vilaService.listar();
    }

    @GetMapping("/{id}")
    public VilaDTO buscarUmaVila(@RequestBody @PathVariable Long id){
        return vilaService.buscarVilaPorId(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarUmaVila(@RequestBody @PathVariable Long id) throws Exception{
        return vilaService.deletarUmaVila(id);
    }
}
