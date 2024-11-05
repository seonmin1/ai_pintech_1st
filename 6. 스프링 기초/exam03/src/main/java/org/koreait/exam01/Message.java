package org.koreait.exam01;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean, DisposableBean {
    // InitializingBean 설정
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet() 호출!");
    }

    // DisposableBean 설정
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy() 호출!");
    }

    // 메서드 정의
    public void send(String message) {
        System.out.printf("메세지:%s, 전송 완료!%n", message);
    }
}
