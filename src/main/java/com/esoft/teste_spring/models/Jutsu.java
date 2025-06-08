package com.esoft.teste_spring.models;

import java.util.List;

import com.esoft.teste_spring.DTOs.JutsuDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "tb_jutsus")
public class Jutsu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dificuldade;

    @ManyToMany(mappedBy = "jutsus")
    private List<Ninja> ninjas;

    public Jutsu(JutsuDTO jutsu){
        this.id = jutsu.id();
        this.nome = jutsu.nome();
        this.dificuldade = jutsu.dificuldade();
    }

}