package org.koreait.global.exceptions.scripts;

import org.koreait.global.exceptions.CommonException;
import org.springframework.http.HttpStatus;

/**
 * scripts Exception 중 가장 상위 클래스
 * - 하위 Exception 클래스는 모두 해당 클래스를 상속 받음
 * 예외가 발생하면 화면 이동이 아니라
 * alert('메세지') 형태로 띄워지게 설정
 */
public class AlertException extends CommonException {
    public AlertException(String message, HttpStatus status) {
        super(message, status);
    }
}
