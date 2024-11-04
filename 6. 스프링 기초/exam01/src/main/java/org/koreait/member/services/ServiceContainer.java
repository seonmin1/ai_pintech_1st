package org.koreait.member.services;

import org.koreait.member.repository.MemberRepository;
import org.koreait.member.validator.AdvancedJoinValidator;
import org.koreait.member.validator.JoinValidator;

public class ServiceContainer {

    public JoinValidator joinValidator() {
        return new JoinValidator();
        // return new AdvancedJoinValidator();
    }

    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

    public JoinService joinService() {
        return new JoinService(joinValidator(), memberRepository()); // 의존성 - joinValidator() 필수
    }

    public JoinService2 joinService2() {
        return new JoinService2(joinValidator()); // 의존성 - joinValidator() 필수
    }
}
