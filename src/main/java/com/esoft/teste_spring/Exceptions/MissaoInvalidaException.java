package com.esoft.teste_spring.Exceptions;

public class MissaoInvalidaException extends RuntimeException {
    public MissaoInvalidaException(String mensagem) {
        super(mensagem);
    }

}
