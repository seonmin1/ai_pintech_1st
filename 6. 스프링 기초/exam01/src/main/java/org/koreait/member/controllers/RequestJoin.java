package org.koreait.member.controllers;

import lombok.Data;

/**
 * 변수 선언
 * 롬복 애노테이션 사용 시 설정 - 컴파일러 - 애노테이션 프로세서 체크
 */
@Data
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String userName;
    private boolean agree; // 약관 동의
}
