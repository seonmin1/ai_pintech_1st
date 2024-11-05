package org.koreait.exam01;

import org.junit.jupiter.api.Test;
import org.koreait.exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        // 객체 생성 -> 의존 설정 -> 초기화
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        // Message 클래스에서 정의한 메서드 호출
        Message m1 = ctx.getBean(Message.class);
        m1.send("안녕하세요!");

        Message m2 = ctx.getBean(Message.class);
        // true - 싱글톤 형태로 객체 관리
        System.out.println(m1 == m2);

        // 소멸 전 destroy() 호출
        ctx.close();
    }

    @Test
    void test2() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Message2 m1 = ctx.getBean(Message2.class);
        Message2 m2 = ctx.getBean(Message2.class);

        // false - 다른 객체로 생성
        System.out.println(m1 == m2);

        ctx.close();
    }
}
