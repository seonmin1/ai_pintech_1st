package org.koreait.member.controllers;

import lombok.Data;

/**
 * 회원가입 기능을 구현하기 위해 필요한 요소들 저장
 */
@Data
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String userName;
    private boolean agree;
}
