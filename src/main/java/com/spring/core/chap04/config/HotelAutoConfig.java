package com.spring.core.chap04.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// chap04 패키지 안에 있는 @Component 가 붙은 클래스들을 모두 자동으로 빈으로 등록하겠다. 주입을 자동으로 수행한다.
@ComponentScan(basePackages = "com.spring.core.chap04")
public class HotelAutoConfig {
}
