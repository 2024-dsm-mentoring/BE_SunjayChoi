package org.board.global.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {
    //유저
    USER_ID_ALREADY_EXIST(409, "User Already Exist"),
    //서버 에러
    INTERNAL_SERVER_ERROR(500, "Server Error");

    private final  Integer statusCode;
    private  final String message;
}
