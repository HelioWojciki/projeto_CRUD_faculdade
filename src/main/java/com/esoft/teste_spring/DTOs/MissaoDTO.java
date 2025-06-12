package com.esoft.teste_spring.DTOs;

import java.util.List;

import com.esoft.teste_spring.models.Missao;

public record MissaoDTO(
                Long id,
                String nome,
                String descricao,
                String dificuldade,
                String status,
                List<Long> ninjasId) {

        public MissaoDTO(Missao missao) {
                this(
                                missao.getId(),
                                missao.getNome(),
                                missao.getDescricao(),
                                missao.getDificuldade(),
                                missao.getStatus(),
                                missao.getNinjas().stream().map(ninja -> ninja.getId()).toList());
        }

}
