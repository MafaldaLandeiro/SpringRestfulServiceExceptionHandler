package org.SpringRestfulServiceExceptionHandler.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/sum")
    public ResponseEntity<Object> sum(@RequestParam(value = "num1") String num1, @RequestParam(value = "num2") String num2) {

        int sum = 0;

        try {
            int value1 = Integer.parseInt(num1);
            int value2 = Integer.parseInt(num2);
            sum = value1 + value2;
        } catch (NumberFormatException ex) {
            return new ResponseEntity<Object>("ERROR MESSAGE", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<Object>(sum, HttpStatus.OK);
    }

    @RequestMapping("/sumAdvice")
    public ResponseEntity<Object> sumAdvice(@RequestParam(value = "num1") String num1, @RequestParam(value = "num2") String num2) throws NumberFormatException {
        int sum = 0;

        int value1 = Integer.parseInt(num1);
        int value2 = Integer.parseInt(num2);
        sum = value1 + value2;

        return new ResponseEntity<Object>(sum, HttpStatus.OK);
    }

}
