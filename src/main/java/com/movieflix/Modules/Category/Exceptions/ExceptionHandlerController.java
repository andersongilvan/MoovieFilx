package com.movieflix.Modules.Category.Exceptions;


import com.movieflix.Modules.Category.Exceptions.DTO.MethodArgumentNotValidExceptionDTO;
import com.movieflix.Modules.Category.Exceptions.DTO.RuntimeExceptionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<RuntimeExceptionDTO> runtimeExceptionHandle(RuntimeException ex) {
        return ResponseEntity.badRequest().body(new RuntimeExceptionDTO(ex.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<MethodArgumentNotValidExceptionDTO>> methodArgumentNotValidException
            (MethodArgumentNotValidException ex) {
        List<MethodArgumentNotValidExceptionDTO> errosList = new ArrayList<>();
        var fieldErrors = ex.getFieldErrors();

        fieldErrors.forEach((error) -> errosList.add(new MethodArgumentNotValidExceptionDTO(
                error.getField(), error.getDefaultMessage())
        ));

        return ResponseEntity.badRequest().body(errosList);
    }

}
