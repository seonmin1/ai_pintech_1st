package org.koreait.exam01.config;

import org.koreait.exam01.Message;
import org.koreait.exam01.Message2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // 설정 클래스임을 알려주는 애노테이션
public class AppCtx {

    @Bean // 수동 등록
    public Message message() {
        return new Message();
    }

    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "close")
    public Message2 message2() {
        return new Message2();
    }
}
