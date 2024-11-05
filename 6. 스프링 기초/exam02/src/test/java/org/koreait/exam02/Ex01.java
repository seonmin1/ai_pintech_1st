package org.koreait.exam02;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx4;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.services.InfoService;
import org.koreait.member.services.JoinService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        // 객체 생성 -> 의존 설정
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx4.class);

        // 각 클래스 가져오기
        JoinService joinService = ctx.getBean(JoinService.class);
        InfoService infoService = ctx.getBean(InfoService.class);

        RequestJoin form = new RequestJoin(); // 객체 생성

        // 각 내역 입력
        form.setEmail("user01@test.org");
        form.setPassword("12345678");
        form.setConfirmPassword("12345678");
        form.setUserName("사용자01");
        form.setAgree(true);

        // 각 클래스 메서드 호출
        joinService.process(form);
        infoService.print();

        // 객체 소멸
        ctx.close();
    }
}
