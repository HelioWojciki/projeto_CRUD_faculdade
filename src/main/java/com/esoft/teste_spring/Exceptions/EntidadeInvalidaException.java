package com.esoft.teste_spring.Exceptions;

public class EntidadeInvalidaException extends RuntimeException {
    public EntidadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
