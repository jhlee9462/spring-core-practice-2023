package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component
public class KimuraChef implements Chef {
    @Override
    public void cook() {
        System.out.println("일식 요리의 대가 키무라입니다.");
    }
}
