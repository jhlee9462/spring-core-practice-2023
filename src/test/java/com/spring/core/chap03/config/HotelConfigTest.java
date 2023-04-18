package com.spring.core.chap03.config;

import com.spring.core.chap03.Hotel;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelConfigTest {

    // 스프링 컨테이너에서 등록된 빈 가져오기
    // 사용할 설정파일 불러오기
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(HotelConfig.class);

    @Test
    void springDiTest() {

        // 스프링 컨테이너에서 등록된 객체를 가져오기
        Hotel hotel = ac.getBean(Hotel.class);
        hotel.inform();

    }
}