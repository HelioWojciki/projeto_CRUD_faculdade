package com.esoft.teste_spring.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esoft.teste_spring.DTOs.JutsuDTO;
import com.esoft.teste_spring.Services.JustuService;

@RestController
@RequestMapping("/jutsus")
public class JutsuController {
    
    public final JustuService justuService;

    public JutsuController(JustuService justuService){
        this.justuService = justuService;
    }

    @GetMapping
    public List<JutsuDTO> listar(){
        return justuService.listar();
    }
}
