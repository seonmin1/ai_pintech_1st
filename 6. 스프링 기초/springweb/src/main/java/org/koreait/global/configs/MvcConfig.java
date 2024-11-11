package org.koreait.global.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
@Import(ControllerConfig.class)
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
        /**
         * 1. 요청주소가 유입되었을 때
         * 2. HandlerMapping이 컨트롤러 빈을 검색
         * 3. 못찾으면 css, js, 정적 웹페이지 html, 이미지 등으로 경로를 검색
         */
    }

    /**
     * 정적 경로 설정
     * 1. HandlerMapping이 컨트롤러 빈을 찾지 못하면 체크해보는 경로 설정
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**") // /** - 하위경로를 포함한 모든 경로
                .addResourceLocations("classpath:/static/");

    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/templates/", ".jsp");
    }
}
