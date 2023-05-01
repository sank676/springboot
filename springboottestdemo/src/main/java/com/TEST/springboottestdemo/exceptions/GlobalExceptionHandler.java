package com.TEST.springboottestdemo.exceptions;

import com.TEST.springboottestdemo.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

    @ControllerAdvice
    @ResponseStatus
    public class GlobalExceptionHandler  extends ResponseEntityExceptionHandler {
        @ExceptionHandler(value = StudentNotFoundException.class)
        public ResponseEntity<ErrorMessage> handleStudentNotFoundException(StudentNotFoundException ex,
                                                                           WebRequest request) {
            ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }


