package com.esoft.teste_spring.DTOs;

import com.esoft.teste_spring.models.Ninja;

public record NinjaDTO(
        Long id,
        String nome,
        int idade,
        String cla,
        Long vilaId, // Alterado de String para Vila
        Long missaoId) {

    public NinjaDTO(Ninja ninja) {
        this(
                ninja.getId(),
                ninja.getNome(),
                ninja.getIdade(),
                ninja.getCla(),
                ninja.getVila() != null ? ninja.getVila().getId() : null,
                ninja.getMissao() != null ? ninja.getMissao().getId() : null);
    }
}