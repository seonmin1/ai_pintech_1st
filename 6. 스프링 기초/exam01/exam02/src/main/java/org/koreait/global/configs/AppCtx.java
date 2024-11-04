package org.koreait.global.configs;

import org.koreait.member.repositories.MemberRepository;
import org.koreait.member.services.InfoService;
import org.koreait.member.services.JoinService;
import org.koreait.member.validators.JoinValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 객체 조립기
 * - 관리할 객체를 넣어줌
 * - 객체를 넣지 않으면 관리해주지 않음
 */
@Configuration
@Import(AppCtx2.class) // 괄호 안의 클래스를 통합시킴
public class AppCtx {

    /*@Bean // 관리할 객체에 넣어줘야 함
    public JoinValidator joinValidator() { // 메서드 명이 기본 빈(Bean)의 이름
        return new JoinValidator();
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

    @Bean
    public JoinService joinService() { // 통제하기 위해 주입
        return new JoinService(joinValidator(), memberRepository());
    }

    @Bean
    public InfoService infoService() { // set으로 객체를 생성했을 때
        InfoService service = new InfoService();
        service.setRepository(memberRepository());
        return service;
    }*/
}
