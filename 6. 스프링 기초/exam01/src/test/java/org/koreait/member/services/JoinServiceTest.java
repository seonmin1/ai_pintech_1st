package org.koreait.member.services;

import org.junit.jupiter.api.Test;
import org.koreait.member.validator.JoinValidator;

public class JoinServiceTest {
    @Test
    void test1() {
        JoinValidator validator = new JoinValidator();
        JoinService joinService = new JoinService(validator);
    }

    @Test
    void test2() {
        JoinService2 joinService2 = new JoinService2(new JoinValidator());
    }

    @Test
    void test3() {
        ServiceContainer container = new ServiceContainer();

        // 완성된 객체를 메서드를 통해 가져옴
        JoinService joinService = container.joinService();
        JoinService2 joinService2 = container.joinService2();
    }
}
