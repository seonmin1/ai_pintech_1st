package org.koreait.global.configs;

import lombok.RequiredArgsConstructor;
import org.koreait.member.validators.JoinValidator;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//  @RequiredArgsConstructor
public class MvcConfig implements WebMvcConfigurer { // WebMvcConfigurer 인터페이스 구현 필수!
    // private final JoinValidator joinValidator;

    /**
     * 모든 @Valid가 적용된 커맨드 객체 검증에 사용
     * - 전역 Validator
     */
    /*@Override
    public Validator getValidator() {
        return joinValidator;
    }*/
}