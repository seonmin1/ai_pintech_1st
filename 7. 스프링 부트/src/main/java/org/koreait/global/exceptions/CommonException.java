package org.koreait.global.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * 모든 도메인이 공유할 예외 처리
 */
@Getter @Setter
public class CommonException extends RuntimeException {

    private HttpStatus status;
    private boolean errorCode; // message가 에러코드인지 여부

    public CommonException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
