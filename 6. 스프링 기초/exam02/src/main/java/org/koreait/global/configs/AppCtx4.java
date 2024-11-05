package org.koreait.global.configs;

import org.koreait.member.repositories.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "org.koreait.member"/*, // member 하위 패키지 컴포넌트 스캔 범위에 들어감
    excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = ManualBean.class) // 배제할 빈 입력*/
        /*, excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MemberRepository.class)*/
        /*, excludeFilters = @ComponentScan.Filter(type=FilterType.ASPECTJ, pattern = "org.koreait..*Repository")
        // org.koreait 하위 패키지 중에서 Repository로 끝나는 모든 클래스를 배제한다*/
)
public class AppCtx4 {

    /*@Bean // 수동 빈 생성
    public MemberRepository memberRepository() {
        System.out.println("호출!");
        return new MemberRepository();
    }*/
}
