package org.board.global.exceptions;

public class AlreayUserIdExistException extends BusinessException{
    public static final BusinessException EXCEPTION = new AlreayUserIdExistException();
    private AlreayUserIdExistException(){
        super(ErrorCode.USER_ID_ALREADY_EXIST);
    }
}