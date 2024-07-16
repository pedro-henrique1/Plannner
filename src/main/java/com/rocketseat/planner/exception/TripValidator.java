package com.rocketseat.planner.exception;


import com.rocketseat.planner.trip.TripResquestPayload;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class TripValidator {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> TripValidatorCreat(@Validated TripResquestPayload payload, BindingResult result) {
        if (payload.ends_at().startsWith(payload.starts_at())) {
            return ResponseEntity.badRequest().body("erro ao criar");
        }
//        return ;
        return null;
    }
}
