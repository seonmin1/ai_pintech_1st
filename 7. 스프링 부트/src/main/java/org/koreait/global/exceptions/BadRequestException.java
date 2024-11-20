package org.koreait.global.exceptions;

import org.springframework.http.HttpStatus;

public class BadRequestException extends CommonException {
    /**
     * 문구와 응답코드 설정
     * 문구 - 잘못된 요청입니다.
     * 응답코드 - 400
     */
    public BadRequestException() {
        this("BadRequest");
        setErrorCode(true); // 에러코드로 메세지 연동
    }
    public BadRequestException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
