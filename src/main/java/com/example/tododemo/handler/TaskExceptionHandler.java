package com.example.tododemo.handler;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TaskExceptionHandler {
    @ExceptionHandler(InvalidFormatException.class)
    public ResponseEntity<Object> handleInvalidFormatException(InvalidFormatException ex){
        String message = "Invalid value for enum type: " + ex.getValue() + ". Accepted values are: [DONE, TODO, IN_PROGRESS].";
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }
}
