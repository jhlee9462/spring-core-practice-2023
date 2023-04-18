package com.spring.core.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    // 테스트 메서드 생성
    @Test
    void lombokTest() {
        Person p = new Person();
        p.setAddress("서울");
        p.setAge(10);
        p.setNickName("마이키");

        System.out.println(p);

        Person qq = new Person("qq", "newYork", 20);
    }
}