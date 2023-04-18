package com.spring.core.chap04.config;

import com.spring.core.chap04.Hotel;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelAutoConfigTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(HotelAutoConfig.class);

    @Test
    void autoDiTest() {
        Hotel hotel = ac.getBean(Hotel.class);
        hotel.inform();
    }
}