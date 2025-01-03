package org.koreait.global.configs;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageSourceConfig {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource ms = new ResourceBundleMessageSource();

        // resources/messages/commons, validations, errors 파일
        ms.addBasenames("messages.commons", "messages.validations", "messages.errors");
        ms.setDefaultEncoding("UTF-8"); // 인코딩을 UTF-8로 기본 설정
        ms.setUseCodeAsDefaultMessage(true); // 메세지 코드를 발견하지 못하면 해당 코드를 메세지로 사용

        return ms;
    }
}
