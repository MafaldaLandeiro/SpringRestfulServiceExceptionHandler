package org.SpringRestfulServiceExceptionHandler.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackages = { "org.SpringRestfulServiceExceptionHandler.controller" })
public class RestfulResponseExceptionHandler {

    @ExceptionHandler(value = NumberFormatException.class)
    public ResponseEntity<Object> numberFormatExceptionExceptionHandler(Exception ex) {
        String response = "ERROR MESSAGE";

        return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);

    }

}
