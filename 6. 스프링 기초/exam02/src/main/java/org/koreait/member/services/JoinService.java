package org.koreait.member.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.repositories.MemberRepository;
import org.koreait.member.validators.JoinValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 회원 가입 기능
 */
@Service
@RequiredArgsConstructor
public class JoinService { // 빈 이름 joinService

    public final JoinValidator validator;

    @NonNull
    public final MemberRepository repository;

    /*public JoinService(JoinValidator validator, MemberRepository repository) {
        this.validator = validator;
        this.repository = repository;
    }*/

    /*@Autowired // 의존성 자동주입
    public JoinValidator validator;

    @Autowired // 의존성 자동주입
    // @Qualifier("mRepo2")
    public MemberRepository repository;*/

    /**
     * 가입 처리
     */
    public void process(RequestJoin form) {
        validator.validate(form); // 유효성 검사
        repository.register(form); // 영구 저장 처리
    }
}
