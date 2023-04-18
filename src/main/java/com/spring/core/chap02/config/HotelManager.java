package com.spring.core.chap02.config;

import com.spring.core.chap02.*;

// 호텔을 운영하기 위한 객체들을 만들어서 호텔에 주입해주는 클래스
// Spring Container: Bean Factory
public class HotelManager {

    // 쉐프 객체를 생성
    public Chef chef() {
        return new JannChef();
    }

    // 코스 객체를 생성
    public Course course() {
        return new FrenchCourse();
    }

    // 레스토랑 객체를 생성
    public Restaurant restaurant() {
        return new WesternRestaurant(chef(), course());
    }

    // 호텔 객체를 생성
    public Hotel hotel() {
//        return new Hotel(restaurant(), chef()); // 생성자 주입

        Hotel hotel = new Hotel();
        hotel.setRestaurant(restaurant());
        hotel.setHeadChef(chef());

        return hotel; // 수정자 주입
    }
}
