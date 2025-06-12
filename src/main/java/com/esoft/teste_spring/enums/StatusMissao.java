package com.esoft.teste_spring.enums;

public enum StatusMissao {
    PENDENTE,
    EM_ANDAMENTO,
    CONCLUIDA;

    public static boolean isValido(String status) {
        for (StatusMissao s : StatusMissao.values()) {
            if (s.name().equalsIgnoreCase(status.replace(" ", "_"))) {
                return true;
            }
        }
        return false;
    }
}