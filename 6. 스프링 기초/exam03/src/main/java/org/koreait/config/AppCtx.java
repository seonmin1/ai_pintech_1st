package org.koreait.config;

import org.koreait.exam04.Calculator;
import org.koreait.exam04.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;

@Configuration
/**
 * 자동으로 설정을 추가해주는 애노테이션
 * 서브 클래스 기반의 프록시 변환
 * 자바 표준은 인터페이스 기반의 프록시 임
 * 스프링 쪽에는 기능을 확장해서 서브 클래스 기반 프록시도 구현함
 */
@EnableAspectJAutoProxy
public class AppCtx {

    @Bean
    public SpringCachedCalculator springCachedCalculator() {
        return new SpringCachedCalculator();
    }

    @Bean
    public SpringProxyCalculator springProxyCalculator() {
        return new SpringProxyCalculator();
    }

    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }
}
