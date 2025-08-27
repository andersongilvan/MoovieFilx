package com.movieflix.Modules.Category.Exceptions;


import com.movieflix.Modules.Category.Exceptions.DTO.RuntimeExceptionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<RuntimeExceptionDTO> runtimeExceptionHandle(RuntimeException ex) {
        return ResponseEntity.badRequest().body(new RuntimeExceptionDTO(ex.getMessage()));
    }

}
