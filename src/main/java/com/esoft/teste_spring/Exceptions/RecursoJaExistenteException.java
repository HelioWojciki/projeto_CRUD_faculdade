package com.esoft.teste_spring.Exceptions;

public class RecursoJaExistenteException extends RuntimeException {
    public RecursoJaExistenteException(String mensagem) {
        super(mensagem);
    }
}