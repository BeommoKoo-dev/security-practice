package com.example.securitypractice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource") // 가져올 값의 prefix
@Getter // 외부에서 사용할 수 있도록 getter 설정
@Setter // 프로퍼티 파일을 맴버변수에 setter를 통하여 바인딩
public class DbConfigProperties {

    private String driverClassName;

    private String url;

    private String username;

    private String password;

}
