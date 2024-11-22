package org.koreait.global.configs;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 정적 경로 설정
 */
@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(FileProperties.class)
public class FileUploadConfig implements WebMvcConfigurer {

    /**
     * 권장 방법
     */
    private final FileProperties properties;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(properties.getUrl() + "**")
                .addResourceLocations("file:///" + properties.getPath());
    }

    /**
     * 비권장 방법
     */
    /*@Value("${file.upload.path}")
    private String filePath;

    @Value("${file.upload.url}")
    private String fileUrl;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(fileUrl + "**")
                .addResourceLocations("file:///" + filePath);  // 슬래시(/)는 한개 생략되므로 두개가 필요할 땐 세개를 입력해야함
    }*/
}
