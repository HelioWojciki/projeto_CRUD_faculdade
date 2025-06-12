package com.esoft.teste_spring.Exceptions;

import java.util.Date;
import java.util.LinkedHashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler { // Trabalho com handlers

    @ExceptionHandler(NaoEncontradoException.class)
    public ResponseEntity<Object> NaoEncontradoExceprionHndler(NaoEncontradoException ex) {
        LinkedHashMap<String, Object> body = new LinkedHashMap<>();
        body.put("message", ex.getMessage());
        body.put("timespan", new Date());
        body.put("error", "Item não encontrado");
        body.put("status", HttpStatus.NOT_FOUND.value());

        return new ResponseEntity(body, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DeleteNegadoException.class)
    public ResponseEntity<Object> DeleteNegadoExceprionHndler(DeleteNegadoException ex) {
        LinkedHashMap<String, Object> body = new LinkedHashMap<>();
        body.put("message", ex.getMessage());
        body.put("timespan", new Date());
        body.put("error", "Item não pode ser removido");
        body.put("status", HttpStatus.METHOD_NOT_ALLOWED.value());

        return new ResponseEntity(body, HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> GlobalExceptionsHandler(Exception ex) {

        LinkedHashMap<String, Object> body = new LinkedHashMap<>();
        body.put("message", ex.getMessage());
        body.put("timespan", new Date());
        body.put("error", "Erro interno do Servidor!");
        body.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());

        return new ResponseEntity(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(AtributoInvalidoException.class)
    public ResponseEntity<Object> handleAtributoInvalidoException(AtributoInvalidoException ex) {
        LinkedHashMap<String, Object> body = new LinkedHashMap<>();
        body.put("message", ex.getMessage());
        body.put("timespan", new Date());
        body.put("error", "Atributo inválido");
        body.put("status", HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(OperacaoNaoPermitidaException.class)
    public ResponseEntity<Object> handleOperacaoNaoPermitidaException(OperacaoNaoPermitidaException ex) {
        LinkedHashMap<String, Object> body = new LinkedHashMap<>();
        body.put("message", ex.getMessage());
        body.put("timespan", new Date());
        body.put("error", "Operação não permitida");
        body.put("status", HttpStatus.FORBIDDEN.value());
        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(RecursoJaExistenteException.class)
    public ResponseEntity<Object> handleRecursoJaExistenteException(RecursoJaExistenteException ex) {
        LinkedHashMap<String, Object> body = new LinkedHashMap<>();
        body.put("message", ex.getMessage());
        body.put("timespan", new Date());
        body.put("error", "Recurso já existente");
        body.put("status", HttpStatus.CONFLICT.value());
        return new ResponseEntity<>(body, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(LimiteAtingidoException.class)
    public ResponseEntity<Object> handleLimiteAtingidoException(LimiteAtingidoException ex) {
        LinkedHashMap<String, Object> body = new LinkedHashMap<>();
        body.put("message", ex.getMessage());
        body.put("timespan", new Date());
        body.put("error", "Limite de dados atingido");
        body.put("status", HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }

}
