package com.marzhiievskyi.tradehubproject.exception_handling;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    public ResponseEntity<CommonException> handleException(RuntimeException ex) {
        return new ResponseEntity<>(CommonException.builder()
                .message(ex.getLocalizedMessage())
                .build(), HttpStatus.NOT_FOUND);
    }
}
