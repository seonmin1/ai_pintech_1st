package org.koreait.exam01;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.global.configs.AppCtx2;
import org.koreait.global.configs.AppCtx3;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.services.InfoService;
import org.koreait.member.services.JoinService;
import org.koreait.member.validators.JoinValidator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex01 {
    @Test
    void test1() {
        /**
         * 애노테이션을 설정하는 스프링 컨데이너 (IoC 컨테이너)
         * - AppCtx에서 만들어진 객체를 담는 공간
         * - 클래스 객체의 정보를 알 수 있도록 클래스 클래스를 넣어줘야 함
         */
        // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        /**
         * AppCtx3.class에는 기본 생성자만 정의되어 있지만 Autowired 의존성 자동주입으로 정의한 기능들이 오류없이 실행
         * 1. 객체 생성 2. 의존성 주입 3. 초기화 -> 모든 완성된 객체가 컨테이너 안에 있다
         */
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx3.class);
        /**
         * 사용할 객체를 getBean 메서드를 통해 가져옴
         * - AppCtx에 객체 만들기가 선행되어야 함
         * - 중복되는 클래스명이 없을 경우에는 클래스명 없이 클래스 클래스만 적어도 됌
         */
        // JoinService service = ctx.getBean("joinService", JoinService.class);
        JoinService service = ctx.getBean(JoinService.class);
        // InfoService infoService = ctx.getBean("infoService", InfoService.class);
        InfoService infoService = ctx.getBean(InfoService.class);
        /**
         * 객체에 값 넣기
         */
        RequestJoin form = new RequestJoin();
        form.setEmail("user01@test.org");
        form.setPassword("12345678");
        form.setConfirmPassword("12345678");
        form.setUserName("사용자01");
        form.setAgree(true);
        /**
         * 메서드 실행
         */
        service.process(form); // 회원 가입 처리
        infoService.print(); // 가입한 회원 목록 처리

        ctx.close();
    }

    @Test
    void test2() {
        // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class, AppCtx2.class);
        /**
         * AppCtx 클래스에서 Import를 통해 AppCtx2 클래스를 통합시켰기 때문에
         * 아래 코드 괄호 안에 AppCtx.class 하나만 넣어도 둘 다 넣은 효과를 볼 수 있음
         */
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        DateTimeFormatter formatter = ctx.getBean(DateTimeFormatter.class);
        String str = formatter.format(LocalDateTime.now()); // 현재 날짜 형식을 문자열로 출력하겠다
        System.out.println(str);

        ctx.close();
    }
}
