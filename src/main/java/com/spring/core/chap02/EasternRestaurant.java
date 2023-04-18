package com.spring.core.chap02;

public class EasternRestaurant implements Restaurant {

    private Chef chef;

    private Course course;

    public EasternRestaurant(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public void order() {
        System.out.println("동양 요리를 주문합니다");
        course.combineMenu();
        chef.cook();
    }
}
