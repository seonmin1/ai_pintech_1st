package org.koreait.member.services;

import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.validator.AdvancedJoinValidator;
import org.koreait.member.validator.JoinValidator;

/**
 * 가입 처리
 * RequestJoin - DTO (Data Transfer Object)
 * : 사용자가 입력한 값을 전달 -> 의존성 (사용자의 값을 받아야만 함), 값을 전달하는 역할 한가지만 수행
 * 값을 전달받고 유효성 검사 필요함
 */
public class JoinService {

    private Validator<RequestJoin> joinValidator;

    /**
     * 의존 관계
     * JoinService 객체 생성을 위해서는 joinValidator 필수!
     */
    public JoinService(Validator<RequestJoin> joinValidator) {
        this.joinValidator = joinValidator;
    }

    /**
     * 연관 관계
     * JoinService 객체를 생성할 때 필수는 아니기 때문
     */
    /*public void setValidator(Validator<RequestJoin> joinValidator) {
        this.joinValidator = joinValidator;
    }*/

    public void process(RequestJoin form) {

    }
}
