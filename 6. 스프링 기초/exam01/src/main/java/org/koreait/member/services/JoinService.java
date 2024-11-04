package org.koreait.member.services;

import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.repository.MemberRepository;
import org.koreait.member.validator.AdvancedJoinValidator;
import org.koreait.member.validator.JoinValidator;

/**
 * 가입 처리
 * RequestJoin - DTO (Data Transfer Object)
 * : 사용자가 입력한 값을 전달 -> 의존성 (사용자의 값을 받아야만 함), 값을 전달하는 역할 한가지만 수행
 * 값을 전달받고 유효성 검사 필요함
 */
public class JoinService {

    private final Validator<RequestJoin> validator;
    private final MemberRepository repository;

    /**
     * 의존 관계
     * JoinService 객체 생성을 위해서는 validator 필수!
     * 위에서 private final로 정의한 변수를 초기화 시켜주어야 함
     */
    public JoinService(Validator<RequestJoin> validator, MemberRepository repository) {
        this.validator = validator;
        this.repository = repository;
    }

    /**
     * 연관 관계
     * JoinService 객체를 생성할 때 필수는 아니기 때문
     */
    /*public void setValidator(Validator<RequestJoin> validator) {
        this.validator = validator;
    }*/

    public void process(RequestJoin form) {
        /**
         * form, joinService에 서로 영향을 주고 받는 관계 - 변화에 영향을 받는다
         * 통제가 필요! - 메서드 안에 감출 필요! 캡슐화! - 변화에 닫힌 구조! (확장에 열려있고 변화에 갇혀있다) - 개방 폐쇄 원칙
         */
        validator.check(form);
    }
}
