package com.esoft.teste_spring.models;


import com.esoft.teste_spring.DTOs.VilaDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_vilas")
public class Vila {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private int nrHabitantes;
    
    // @ManyToOne
    // @JoinColumn(name = "vila_id")
    // public Ninja ninja;

    public Vila(VilaDTO vila){
        this.id = vila.id();
        this.nome = vila.nome();
        this.nrHabitantes = vila.nrHabitantes();
    }
}