package com.esoft.teste_spring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Jutsu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dificuldade;

    // public Jutsu(JutsuDTO jutsu){
    //     this.id = jutsu.id();
    //     this.nome = jutsu.nome();
    //     this.dificuldade = jutsu.dificuldade();
    // }

}



// Nome 
// o Descrição 
// o Dificuldade 
// o Faça a relação (n:n) com Ninja para dizer quais jutsus um ninja 
// sabe usar  