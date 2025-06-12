package com.esoft.teste_spring.Exceptions;

public class JutsuProibidoException extends RuntimeException {
    public JutsuProibidoException(String mensagem) {
        super(mensagem);
    }

}
