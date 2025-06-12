package com.esoft.teste_spring.Exceptions;

public class LimiteAtingidoException extends RuntimeException {
    public LimiteAtingidoException(String mensagem) {
        super(mensagem);
    }
}