package com.rocketseat.planner.infra;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.w3c.dom.events.EventException;

@ControllerAdvice
public class RestExeptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EventException.class)
    private ResponseEntity<String> tripCreateError() {

        return null;
    }
}
