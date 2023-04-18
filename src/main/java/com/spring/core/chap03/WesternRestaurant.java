package com.spring.core.chap03;

public class WesternRestaurant implements Restaurant {

    private Chef chef; // 쉐프

    private Course course; // 요리 코스

    public WesternRestaurant(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void order() {
        System.out.println("서양 요리를 주문합니다");
        course.combineMenu();
        chef.cook();
    }
}
