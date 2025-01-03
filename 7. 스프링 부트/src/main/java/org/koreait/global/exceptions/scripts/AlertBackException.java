package org.koreait.global.exceptions.scripts;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * 예외가 발생하면 alert('메세지') 실행
 * 이후 target 찾아서 history.back() 이동
 */
@Getter @Setter
public class AlertBackException extends AlertException {

    private String target;

    public AlertBackException(String message, HttpStatus status, String target) {
        super(message, status);

        this.target = target;
    }

    public AlertBackException(String message, HttpStatus status) {
        this(message, status, "self");
    }
}
