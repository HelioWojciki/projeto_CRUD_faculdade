
// package com.esoft.teste_spring.models;

// import jakarta.persistence.*;
// import lombok.Getter;
// import lombok.Setter;

// import java.util.List;


// @Entity
// @Setter
// @Getter
// public class  Jutsu {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String nome;
//     private String descricao;
//     private String dificuldade;

//     @ManyToMany(mappedBy = "jutsus")
//     private List<Ninja> ninjas;

//     public Jutsu() {
//     }

//     public Jutsu(String nome, String descricao) {
//         this.nome = nome;
//         this.descricao = descricao;
//         this.dificuldade = dificuldade; 
//     }
// }