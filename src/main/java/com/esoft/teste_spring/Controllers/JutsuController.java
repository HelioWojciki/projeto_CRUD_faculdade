package com.esoft.teste_spring.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esoft.teste_spring.DTOs.JutsuDTO;
import com.esoft.teste_spring.Services.JutsuService;
import com.esoft.teste_spring.models.Jutsu;

@RestController
@RequestMapping("/jutsus")
public class JutsuController {
    
    public final JutsuService jutsuService;

    public JutsuController(JutsuService jutsuService){
        this.jutsuService = jutsuService;
    }

    @GetMapping
    public List<JutsuDTO> listar(){
        return jutsuService.listar();
    }

    @PostMapping
    public JutsuDTO criar(@RequestBody Jutsu jutsu){
        return jutsuService.criarJutsu(jutsu);
    }
}
