package com.esoft.teste_spring.Exceptions;

public class AtributoInvalidoException extends RuntimeException{
    public AtributoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
