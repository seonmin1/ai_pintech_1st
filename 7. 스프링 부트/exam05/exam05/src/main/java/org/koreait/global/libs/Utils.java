package org.koreait.global.libs;

import org.springframework.stereotype.Component;

@Component("ut")
public class Utils { // 빈의 이름 - ut (컴포넌트 뒤에 정의한 이름)
    public String hello(String name) {
        return String.format("%s님 반갑습니다.", name);
    }
}
