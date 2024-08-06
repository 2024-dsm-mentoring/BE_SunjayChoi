package org.board.global.exceptions;

import org.board.global.config.error.ErrorResponse;
import org.board.global.config.error.entity.ErrorResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BusinessExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    protected ResponseEntity<ErrorResponseEntity> handleCustomException(BusinessException businessException){
        return ErrorResponseEntity.responseEntity(businessException.getErrorCode());
    }
}
