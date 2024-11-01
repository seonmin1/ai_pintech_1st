package org.koreait.exam01.main;

import org.junit.jupiter.api.Test;
import org.koreait.exam01.Greeter;
import org.koreait.exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 싱글톤 패턴 실습
 * test 폴더에 생성 시 Test 애노테이션 붙여줌
 * main 함수 대신 void 사용
 */
public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        /**
         * 클래스의 구성정보를 알 수 있는 클래스 클래스 객체 입력
         * AnnotationConfig : 설정방식
         * ApplicationContext : 스프링 컨테이너
         */

        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        g1.hello("코딩병아리");

        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        System.out.println(g1 == g2);
        /**
         * 출력값 : true
         * 동일객체 - 싱글톤패턴 (한개만 가지고 필요할때마다 생성해서 사용)
         * 싱글톤 형태로 객체 관리
         */

        ctx.close();
    }
}
