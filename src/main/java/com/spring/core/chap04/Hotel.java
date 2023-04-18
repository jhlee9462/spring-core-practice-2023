package com.spring.core.chap04;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @problem : 호텔 클래스에서 직접 객체를 생성하면
 *            나중에 의존객체를 변경해야 될 때
 *            직접 호텔 클래스를 수정해야 되므로
 *            OCP를 위반하게 됨.
 *            그리고 headChef가 변경되면 레스토랑
 *            안에 있는 쉐프도 같이 바뀌어야 할
 *            때 2 군데를 수정해야 함.
 */
@Component // 이 호텔 클래스의 객체는 스프링이 관리해라
@NoArgsConstructor
public class Hotel {

    // 제어의 역전 (Inversion of Control) : 객체 생성의 제어권을 외부로 넘긴다.
    // 의존성 주입 (Dependency Injection) : 외부에서 생성된 객체를 주입받는 개념

    // 레스토랑 객체에 의존
    private Restaurant restaurant;

    // 헤드 쉐프
    private Chef headChef;

    @Autowired // 컨테이너에 등록된 객체를 알아서 주입좀 해줘
    // 생성자 주입
    public Hotel(Restaurant restaurant, @Qualifier("kimuraChef") Chef headChef) {
        this.restaurant = restaurant;
        this.headChef = headChef;
    }

//    // 수정자 주입 - 자동 주입에서 세터가 있으면 안된다.
//    public void setHeadChef(Chef headChef) {
//        this.headChef = headChef;
//    }
//
//    public void setRestaurant(Restaurant restaurant) {
//        this.restaurant = restaurant;
//    }

    // 호텔의 정보를 알려주는 기능
    public void inform() {
        System.out.printf("우리 호텔의 레스토랑은 %s 입니다. 헤드 쉐프는 %s 입니다.\n"
                        , restaurant.getClass().getSimpleName()
                        , headChef.getClass().getSimpleName());
        restaurant.order();
    }
}
