package com.spring.core.chap01;

public class EasternRestaurant implements Restaurant {

    private Chef chef = new KimuraChef();

    private Course course = new SushiCourse();

    @Override
    public void order() {
        System.out.println("동양 요리를 주문합니다");
        course.combineMenu();
        chef.cook();
    }
}
