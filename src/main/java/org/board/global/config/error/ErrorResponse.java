package org.board.global.config.error;

import lombok.Builder;
import org.board.global.exceptions.ErrorCode;

import java.time.LocalDateTime;

@Builder
public record ErrorResponse(
        String message,
        int status,
        LocalDateTime timestamp,
        String description
) {
    public static ErrorResponse of(ErrorCode errorCode, String description){
        return ErrorResponse.builder()
                .message(errorCode.getMessage())
                .status(errorCode.getStatusCode())
                .timestamp(LocalDateTime.now())
                .description(description)
                .build();
    }

    public static ErrorResponse of(int statusCode, String description){
        return ErrorResponse.builder()
                .message(description)
                .status(statusCode)
                .timestamp(LocalDateTime.now())
                .description(description)
                .build();
    }
}
