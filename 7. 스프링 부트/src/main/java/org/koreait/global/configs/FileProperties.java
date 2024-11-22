package org.koreait.global.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 정적 경로 설정
 * - 파일이 많을 때 주로 사용하는 방법
 * - ConfigurationProperties 애노테이션 사용하여 주입
 */
@Data
@ConfigurationProperties(prefix="file.upload")
public class FileProperties {
    private String path; // file.upload.path 주입
    private String url; // file.upload.url 주입
}
