package org.koreait.member.validator;

import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;

/**
 * 회원가입 유효성 검사
 * 공통된 설계원칙 (인터페이스) 필요
 */
public class JoinValidator implements Validator<RequestJoin> {

    public void check(RequestJoin form) {

    }
}
