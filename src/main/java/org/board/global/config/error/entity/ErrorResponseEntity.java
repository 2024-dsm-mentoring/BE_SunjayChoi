package org.board.global.config.error.entity;

import lombok.Builder;
import lombok.Getter;
import org.board.global.exceptions.ErrorCode;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

@Getter
@Builder
public class ErrorResponseEntity {
    private int status;
    private String code;
    private String message;
    private LocalDateTime createLocalDateTime;

    public static ResponseEntity<ErrorResponseEntity> responseEntity(ErrorCode errorCode){
        return ResponseEntity
                .status(errorCode.getStatusCode())
                .body(ErrorResponseEntity.builder()
                        .status(errorCode.getStatusCode())
                        .code(errorCode.name())
                        .message(errorCode.getMessage())
                        .createLocalDateTime(LocalDateTime.now())
                        .build()
                );
    }
}
